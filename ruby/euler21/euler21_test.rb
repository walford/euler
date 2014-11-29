require_relative 'euler21'
require 'minitest/autorun'

class TestEuler < Minitest::Test

  def test_number
    number = Number.new(10)
    assert_equal(10, number.value)
  end

  def test_sum_of
    nums = [1,2,3,4,5,]
    number = Number.new(10)
    assert_equal(15, number.send(:sum_of, nums))
  end

  def test_divisor_sum
    number = Number.new(10)
    assert_equal(8, number.divisors_sum)
    number.value = 100
    assert_equal(117, number.divisors_sum)
  end

  def test_get_sum
    nums = [{num: 1, value: 14}, {num: 2, value: 14}]
    assert_equal(28, get_sum(nums) )
  end

  def test_get_amicable
    nums = [{num: 220, value: 284}, {num: 284, value: 220}]
    assert_equal(nums, get_amicable(nums))
  end

end

10

5
2
1
