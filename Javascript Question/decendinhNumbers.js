function compareNumbersDescending(a, b) {
  return b - a;
}



const array = [5, 10, 80, 3, 25];

const sortedArrayDescending = array.sort(compareNumbersDescending);

console.log(sortedArrayDescending); // [80, 25, 10, 5, 3]

