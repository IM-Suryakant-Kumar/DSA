// Function to check if a number is prime
function isPrime(num) {
  // Edge cases
  if (num <= 1) return false; // 0 and 1 are not prime numbers
  if (num <= 3) return true;  // 2 and 3 are prime numbers

  // Check for divisibility by 2 or 3
  if (num % 2 === 0 || num % 3 === 0) return false;

  // Check for divisibility from 5 to sqrt(num)
  for (let i = 5; i * i <= num; i += 6) {
    if (num % i === 0 || num % (i + 2) === 0) return false;
  }

  return true;
}

// Example usage
console.log(isPrime(11)); // true
console.log(isPrime(15)); // false
console.log(isPrime(17)); // true
// O(sqrt(n)) time complexity