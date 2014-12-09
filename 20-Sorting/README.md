Array: Time (Thousand Nano Seconds) : Comparisons

Built-in
100            :       186 : N/A
1000           :      1004 : N/A
10000          :      6937 : N/A
100000         :     19903 : N/A
200000         :     24856 : N/A
400000         :     35067 : N/A
Best (100000)  :     45932 : N/A
Worst (100000) :     34529 : N/A

Inseration Sort
100            :       117 :         4663
1000           :      9248 :       507831
10000          :     25675 :     49509215
100000         :   1446580 :    639370283
200000         :   5760789 :  19798718611 
400000         :  25466650 :  70184824413
Best (100000)  :     45932 :        99999
Worst (100000) :   4683694 :   9999999999

Selection Sort
100            :       238 :         9999
1000           :     13607 :       999999
10000          :    102830 :     99999999
100000         :   9637001 :   9999999999
200000         :  39967983 :  39999999999
400000         : 165893144 : 159999999999
Best (100000)  :  11588533 :   9999999999
Worst (100000) :  11379010 :   9999999999

Based on testing comparisons and timings, Inseration sorts seems to be the better sorting algorithm.

This is because Selection sort has to parse the entire array to find the next value.
So if an array is in order, it will still attempt to make sure it has the min.

Insertion sort just takes an element and places it in the correct spot.
This means that if an array is in order, the number of comparison is reduced and more optimal.

However if the arrays are completely out of order, both functions perform the same number of comparisons. This is very unlikely as a backwards array is as unlikely to occur as a perfectly sorted array by chance. However, the if the list is partial sorted, the Insertion sort does take the advantage.