class Calculator

  attr_reader :names

  def initialize(names)
    @names = names
  end

  # way too easy, maybe refactor for efficiency?
  def calculate
    score = 0

    names.each do |name|
      current_score = 0
      name_score = 0

      name.split('').each do |letter|
        current_score += LETTER_SCORES[letter]
        name_score = current_score
      end

      current_score *= names.index(name) + 1
      score += current_score
    end

    score
  end

end
