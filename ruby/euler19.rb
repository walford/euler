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

require 'pry'

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


  def incremente

    puts "#{year} : #{month} : #{day} : #{month_day}"

    $mondays_on_first += 1 if (self.month_day == 1 && self.day == 'mon')

    # increment day of week
    check_day(self.day, self.days)

    # check leap year
    (self.year % 4 == 0) ? self.leap = true : self.leap = false

    # increment february
    if self.month == 'feb' && self.leap == true
      if self.month_day >= 29
        check_month(self.month, self.months)
      else
        self.month_day += 1
      end
    else
      if self.month_day >= 28
        check_month(self.month, self.months)
      else
        self.month_day += 1
      end
    end

    # increment months other than february
    if self.month == 'sep' || self.month == 'apr' || self.month == 'jun' || self.month == 'nov'
      if self.month_day >= 30
        check_month(self.month, self.months)
      else
        self.month_day += 1
      end
    elsif
      if self.month_day >= 31
        check_month(self.month, self.months)
      else
        self.month_day += 1
      end
    end

    # increment year
    self.year += 1 if (self.month == 'dec' && self.month_day == 31)

  end

  def check_month(month, months)
    month == months.last ? month = months.first : month = months[months.index(month)+1]
  end

  def check_day(day, days)
    day == days.last ? day = days.first : day = days[days.index(day)+1]
  end

end

time = PointInTime.new(
  %w[mon tue wed thr fri sat sun],
  %w[jan feb mar apr may jun jul aug sep oct nov dec],
  false,
  1900,
  1
)
# binding.pry
# while time.year < 2000
#   time.incremente
# end
100.times do
  time.incremente
end

puts $mondays_on_first










# end
