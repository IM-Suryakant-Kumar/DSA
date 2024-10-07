function primeFactors(n) {
	// print the number of 2s that divide n
	while (n % 2 === 0) {
		console.log(2);
		n = n / 2;
	}

	for (let i = 3; i * i <= n; i = i + 2) {
		while (n % i === 0) {
			console.log(i);
			n = n / i;
		}
	}

	// this condition is to handle the case when n is a prime number greater than 2
	if (n > 2) {
		console.log(n);
	}
}

// primeFactors(10); // 2, 5
// primeFactors(44); // 2,2,11
// primeFactors(11); // 11
primeFactors(315); // 3,3,5,7
