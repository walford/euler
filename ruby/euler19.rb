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

days   = %w[mon tue wed thr fri sat sun]
months =  %w[jan feb mar apr may jun jul aug sep oct nov dec]

leap      = false
year      = 1900
day       = days.first
month     = montsh.first
month_day = 1

mondays_on_first = 0


def incrementer

  if year > 2000
    return
  elsif month_day == 1 && day == 'mon'
    mondays_on_first += 1
  else
    # incriment here
  end

end
