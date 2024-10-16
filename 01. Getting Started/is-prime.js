function isPrime(num) {
	if (num <= 1) return false;
	if (num <= 3) return true;

	if (num % 2 === 0 || num % 3 === 0) return false;

	for (let i = 5; i * i <= num; i += 6) {
		if (num % i === 0 || num % (i + 2) === 0) return false;
	}

	return true;
}

// time-complexity: O(sqrt(n))

console.log(isPrime(2))
console.log(isPrime(3))
console.log(isPrime(5))
console.log(isPrime(8))
console.log(isPrime(10))
console.log(isPrime(15))
