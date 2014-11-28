# n! means n × (n − 1) × ... × 3 × 2 × 1
#
# For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
# and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.
#
# Find the sum of the digits in the number 100!

start = 100
pre_answer = 1

while start > 1
  pre_answer *= start
  start -= 1
end

pre_answer = pre_answer.to_s
pre_answer = pre_answer.split("")

answer = 0
pre_answer.each do |num|
  answer += num.to_i
end

puts answer
