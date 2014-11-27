# You are given the following information, but you may prefer to do some research for yourself.
#
#   1 Jan 1900 was a Monday.
#   Thirty days has September,
#   April, June and November.
#   All the rest have thirty-one,
#   Saving February alone,
#   Which has twenty-eight, rain or shine.
#   And on leap years, twenty-nine.
#   A leap year occurs on any year evenly divisible by 4, but not on a century unless it is divisible by 400.
#
#  How many Sundays fell on the first of the month during the twentieth century (1 Jan 1901 to 31 Dec 2000)?


$mondays_on_first = 0


class PointInTime

  attr_accessor :days, :months, :leap, :year, :day, :month, :month_day

  def initialize(days, months, leap, year, month_day)
    self.days = days
    self.months = months
    self.leap = leap
    self.year = year
    self.month_day = month_day
    self.day = days.first
    self.month = months.first
  end

  def increment
    $mondays_on_first += 1 if (self.month_day == 1 && self.day == 'mon')

    check_day(self.day, self.days)

    (self.year % 4 == 0) ? self.leap = true : self.leap = false

    if self.month == 'feb'
      if self.leap == true
        set_month_day(self.month_day, 29)
      else
        set_month_day(self.month_day, 28)
      end
    elsif self.month == 'sep' || self.month == 'apr' || self.month == 'jun' || self.month == 'nov'
      set_month_day(self.month_day, 30)
    else
      set_month_day(self.month_day, 31)
    end

    self.year += 1 if (self.month == 'dec' && self.month_day == 31)
  end


  private


  def check_month(month, months)
    month == months.last ? self.month = months.first : self.month = months[months.index(month)+1]
  end

  def check_day(day, days)
    day == days.last ? self.day = days.first : self.day = days[days.index(day)+1]
  end

  def set_month_day(month_day, last_day)
    if month_day >= last_day
      check_month(self.month, self.months)
      self.month_day = 1
    else
      self.month_day += 1
    end
  end

end

time = PointInTime.new(
  %w[mon tue wed thr fri sat sun],
  %w[jan feb mar apr may jun jul aug sep oct nov dec],
  false,
  1901,
  1
)

while time.year < 2001
  time.increment
end

puts $mondays_on_first
