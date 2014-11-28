# n! means n × (n − 1) × ... × 3 × 2 × 1
#
# For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
# and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.
#
# Find the sum of the digits in the number 100!
require 'pry'

start = 100
answer = 1

while start > 1
  answer *= start
  start -= 1
end

answer = answer.to_s
answer = answer.split("")
binding.pry
foo = 0
answer.each do |num|
  foo += num.to_i
end

puts foo
