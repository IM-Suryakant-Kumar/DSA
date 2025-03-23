//{ Driver Code Starts
// Initial Template for javascript
// Position this line where user code will be pasted.
// Initial Template for javascript

'use strict';

process.stdin.resume();
process.stdin.setEncoding('utf-8');

let inputString = '';
let currentLine = 0;

process.stdin.on('data', inputStdin => { inputString += inputStdin; });

process.stdin.on('end', _ => {
    inputString =
        inputString.trim().split('\n').map(string => { return string.trim(); });
    main();
});

function readLine() { return inputString[currentLine++]; }

function printArray(arr) {
    let s = '';
    for (let i of arr) {
        s += i + " ";
    }
    console.log(s);
    console.log("~");
}

function main() {
    let t = parseInt(readLine());
    let i = 0;
    for (; i < t; i++) {
        let input1 = readLine().split(' ').map(x => parseInt(x));
        let n = input1.length;
        let a = new Array(n);
        for (let i = 0; i < n; i++) {
            a[i] = input1[i];
        }
        let obj = new Solution();
        obj.reverseArray(a);
        printArray(a);
    }
}

// } Driver Code Ends


// User function Template for javascript
/**
 * @param {number[]} arr
 * @returns {number[]}
 */

class Solution {
    // Function to reverse the array.
    reverseArray(arr) {
        // your code here
        let s = 0, e = arr.length - 1, n = arr.length;
        
        for(let i = 0; i < n / 2; i++) {
            let temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
    }
}