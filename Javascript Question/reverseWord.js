
function reverseWords(sentence) {
  
  const words = sentence.split(' ');

 
  const reversedWords = words.map(word => word.split('').reverse().join(''));

  
  return reversedWords.join(' ');
}



const sentence = 'This is a sunny day';

const reversedSentence = reverseWords(sentence);

console.log(reversedSentence);