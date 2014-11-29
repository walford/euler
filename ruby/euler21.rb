# Let d(n) be defined as the sum of proper divisors of n (numbers less than n
# which divide evenly into n). If d(a) = b and d(b) = a, where a ≠ b, then a
# and b are an amicable pair and each of a and b are called amicable numbers.
#
# For example, the proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44, 55
# and 110; therefore d(220) = 284. The proper divisors of 284 are 1, 2, 4, 71 and
# 142; so d(284) = 220.
#
# Evaluate the sum of all the amicable numbers under 10000.
require 'pry'

class Number

  attr_accessor :value

  def initialize(value)
    self.value = value
  end

  def proper_divisors_sum
    divisors = []
    for i in 1..(value/2)
      self.value % i == 0 ? divisors << i : next
    end
    sum = sum_of(divisors)
  end

  private

  def sum_of(nums)
    sum = 0
    nums.each {|n| sum += n}
    sum
  end

end

numbers = []

for i in 1..10000
  number = Number.new(i)
  numbers << number
end


divisor_sums = []

numbers.map {|n| divisor_sums << n.proper_divisors_sum}


amicable_nums = []

divisor_sums.map do |n|
  divisor_sums.count(n) > 1 ? amicable_nums << n : next
end

sum = 0
amicable_nums.each {|n| sum += n}

puts sum














# end
