require_relative 'euler21'

puts "\ncalculating amicable pairs below 10000"
puts "\n--------------------------------------"
puts "this may take a moment..."

numbers = []

for i in 1..9999
  n = Number.new(i)
  numbers << {value: n.value, div_sum: n.divisors_sum}
end

numbers = get_amicable(numbers)

puts "--------------------------------------"
puts "\ncalculation complete!"

sum = get_sum(numbers)

puts "sum of amicable numbers below 10000 is:"
puts sum
puts
