Q1) Chef and Instant Noodles
Chef has invented 
1-minute Instant Noodles. As the name suggests, each packet takes exactly 
1 minute to cook.
Chef's restaurant has 
𝑋
X stoves and only 1 packet can be cooked in a single stove at any minute.
How many customers can Chef serve in 𝑌 minutes if each customer orders exactly 1 packet of noodles?
Ans) 2 3
      6
Chef and Brain Speed
In ChefLand, human brain speed is measured in bits per second (bps). Chef has a threshold limit of 
𝑋
X bits per second above which his calculations are prone to errors. If Chef is currently working at 
𝑌
Y bits per second, is he prone to errors?

If Chef is prone to errors print YES, otherwise print NO.

Input Format
The only line of input contains two space separated integers 
𝑋
X and 
𝑌
Y — the threshold limit and the rate at which Chef is currently working at.

Output Format
If Chef is prone to errors print YES, otherwise print NO.

You may print each character of the string in uppercase or lowercase (for example, the strings yes, Yes, yEs, and YES will all be treated as identical).

Constraints
1
≤
𝑋
,
𝑌
≤
100
1≤X,Y≤100
Ans) 7 9
      yes
6  6
No

Q3)Alice and Marks
Alice has scored 
𝑋
X marks in her test and Bob has scored 
𝑌
Y marks in the same test. Alice is happy if she scored at least twice the marks of Bob’s score. Determine whether she is happy or not.

Input Format
The first and only line of input contains two space-separated integers 
𝑋
,
𝑌
X,Y — the marks of Alice and Bob respectively.
Output Format
For each testcase, print Yes if Alice is happy and No if she is not, according to the problem statement.

The judge is case insensitive so you may output the answer in any case. In particular YES, yes, yEsare all considered equivalent toYes`.

Constraints
1
≤
𝑋
,
𝑌
≤
100
1≤X,Y≤100
Ans) 1  2
      No

    2   1
     yes

Q4)Oneful Pairs
Chef defines a pair of positive integers 
(
𝑎
,
𝑏
)
(a,b) to be a 
Oneful Pair
Oneful Pair, if

𝑎
+
𝑏
+
(
𝑎
⋅
𝑏
)
=
111
a+b+(a⋅b)=111

For example, 
(
1
,
55
)
(1,55) is a 
Oneful Pair
Oneful Pair, since 
1
+
55
+
(
1
⋅
55
)
=
56
+
55
=
111
1+55+(1⋅55)=56+55=111.
But 
(
1
,
56
)
(1,56) is not a 
Oneful Pair
Oneful Pair, since 
1
+
56
+
(
1
⋅
56
)
=
57
+
56
=
113
≠
111
1+56+(1⋅56)=57+56=113=111.

Given two positive integers 
𝑎
a and 
𝑏
b, output Yes if they are a 
Oneful Pair
Oneful Pair. And No otherwise.

Input Format
The only line of input contains two space-separated integers 
𝑎
a and 
𝑏
b.

Output Format
Output Yes, if 
(
𝑎
,
𝑏
)
(a,b) form a 
Oneful Pair
Oneful Pair. Output No if they do not.

You may print each character of Yes and No in uppercase or lowercase (for example, yes, yEs, Yes will be considered identical).

Constraints
1
≤
𝑎
,
𝑏
≤
1000
1≤a,b≤1000
Ans) 1 55
      Yes
      
     1  56
       No
