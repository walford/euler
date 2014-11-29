# Let d(n) be defined as the sum of proper divisors of n (numbers less than n
# which divide evenly into n). If d(a) = b and d(b) = a, where a ≠ b, then a
# and b are an amicable pair and each of a and b are called amicable numbers.
#
# For example, the proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44, 55
# and 110; therefore d(220) = 284. The proper divisors of 284 are 1, 2, 4, 71 and
# 142; so d(284) = 220.
#
# Evaluate the sum of all the amicable numbers under 10000.

class Number

  attr_accessor :value

  def initialize(value)
    self.value = value
  end

  def divisors_sum
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


def get_amicable(numbers)
  amicable = []

  numbers.each do |num|
    if numbers.include?({value: num[:div_sum], div_sum: num[:value]}) && num[:div_sum] != num[:value]
      amicable << num
      puts "#{num} => #{{value: num[:div_sum], div_sum: num[:value]}}"
    end
  end

  amicable
end


def get_sum(numbers)
  sum = 0
  numbers.each {|n| sum += n[:value]}
  sum
end


puts "calculating amicable pairs below 10000"
puts "\n--------------------------------------"

numbers = []

for i in 1..9999
  n = Number.new(i)
  numbers << {value: n.value, div_sum: n.divisors_sum}
end

numbers = get_amicable(numbers)

puts "--------------------------------------"
puts "\ncalculation complete"

sum = get_sum(numbers)

puts "sum of amicable numbers below 10000 is:"
puts sum
