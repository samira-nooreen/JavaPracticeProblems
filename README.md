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

---------------------------------------------------------------------------------------------------------------------------------------
Q5)Add Two Numbers
Your task is very simple: given two integers 
𝐴
A and 
𝐵
B, write a program to add these two numbers and output the sum.

Input Format
The first line contains an integer 
𝑇
T, the total number of test cases.
Then follow 
𝑇
T lines, each line contains two integers, 
𝐴
A and 
𝐵
B.
Output Format
For each test case, add 
𝐴
A and 
𝐵
B and display the sum in a new line.

Constraints
1
≤
𝑇
≤
1000
1≤T≤1000
0
≤
𝐴
,
𝐵
≤
10000
0≤A,B≤10000

Ans)
Input               Output
3
1 2                  3

100 200             300
                   
10 40                50
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Q6)Good Turn
Chef and Chefina are playing with dice. In one turn, both of them roll their dice at once.

They consider a turn to be good if the sum of the numbers on their dice is greater than 
6
6.
Given that in a particular turn Chef and Chefina got 
𝑋
X and 
𝑌
Y on their respective dice, find whether the turn was good.

Input Format
The first line of input will contain a single integer 
𝑇
T, denoting the number of test cases.
Each test case contains two space-separated integers 
𝑋
X and 
𝑌
Y — the numbers Chef and Chefina got on their respective dice.
Output Format
For each test case, output on a new line, YES, if the turn was good and NO otherwise.

Each character of the output may be printed in either uppercase or lowercase. That is, the strings NO, no, nO, and No will be treated as equivalent.

Constraints
1
≤
𝑇
≤
100
1≤T≤100
1
≤
𝑋
,
𝑌
≤
6
1≤X,Y≤6
Ans)
Input
4
1 4
3 4
4 2
2 6

Output
NO
YES
NO
YES

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Q7)Water Consumption
Recently, Chef visited his doctor. The doctor advised Chef to drink at least 
2000
2000 ml of water each day.

Chef drank 
𝑋
X ml of water today. Determine if Chef followed the doctor's advice or not.

Input Format
The first line contains a single integer 
𝑇
T — the number of test cases. Then the test cases follow.
The first and only line of each test case contains one integer 
𝑋
X — the amount of water Chef drank today.
Output Format
For each test case, output YES if Chef followed the doctor's advice of drinking at least 
2000
2000 ml of water. Otherwise, output NO.

You may print each character of the string in uppercase or lowercase (for example, the strings YES, yEs, yes, and yeS will all be treated as identical).

Constraints
1
≤
𝑇
≤
2000
1≤T≤2000
1
≤
𝑋
≤
4000
1≤X≤4000
Sample 1:
Input          
3
2999
1450
2000

               Output
                 YES
                 NO
                 YES
 ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 Q8)Age Limit
Chef wants to appear in a competitive exam. To take the exam, there are following requirements:

Minimum age limit is 
𝑋
X (i.e. Age should be greater than or equal to 
𝑋
X).
Age should be strictly less than 
𝑌
Y.
Chef's current Age is 
𝐴
A. Find whether he is currently eligible to take the exam or not.

Input Format
First line will contain 
𝑇
T, number of test cases. Then the test cases follow.
Each test case consists of a single line of input, containing three integers 
𝑋
,
𝑌
,
X,Y, and 
𝐴
A as mentioned in the statement.
Output Format
For each test case, output YES if Chef is eligible to give the exam, NO otherwise.

You may print each character of the string in uppercase or lowercase (for example, the strings YES, yEs, yes, and yeS will all be treated as identical).

Constraints
1
≤
𝑇
≤
1000
1≤T≤1000
20
≤
𝑋
<
𝑌
≤
40
20≤X<Y≤40
10
≤
𝐴
≤
50
10≤A≤50
Ans)
Input
5
21 34 30
25 31 31
22 29 25
20 40 15
28 29 28


Output
YES
NO
YES
NO
YES

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Q9)Biryani classes
According to a recent survey, Biryani is the most ordered food. Chef wants to learn how to make world-class Biryani from a MasterChef. Chef will be required to attend the MasterChef's classes for 
𝑋
X weeks, and the cost of classes per week is 
𝑌
Y coins. What is the total amount of money that Chef will have to pay?

Input Format
The first line of input will contain an integer 
𝑇
T — the number of test cases. The description of 
𝑇
T test cases follows.
The first and only line of each test case contains two space-separated integers 
𝑋
X and 
𝑌
Y, as described in the problem statement.
Output Format
For each test case, output on a new line the total amount of money that Chef will have to pay.

Constraints
1
≤
𝑇
≤
1
0
4
1≤T≤10 
4
 
1
≤
𝑋
,
𝑌
≤
100
1≤X,Y≤100
Sample 1:
Input
Output
4
1 10
1 15
2 10
2 15
10
15
20
30
Explanation:
Test case 
1
1: Chef will be required to attend the MasterChef's classes for 
1
1 week and the cost of classes per week is 
10
10 coins. Hence, Chef will have to pay 
10
10 coins in total.

Test case 
2
2: Chef will be required to attend the MasterChef's classes for 
1
1 week and the cost of classes per week is 
15
15 coins. Hence, Chef will have to pay 
15
15 coins in total.

Test case 
3
3: Chef will be required to attend the MasterChef's classes for 
2
2 weeks and the cost of classes per week is 
10
10 coins. Hence, Chef will have to pay 
20
20 coins in total.

Test case 
4
4: Chef will be required to attend the MasterChef's classes for 
2
2 weeks and the cost of classes per week is 
15
15 coins. Hence, Chef will have to pay 
30
30 coins in total.

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Q10)Burgers
Chef is fond of burgers and decided to make as many burgers as possible.

Chef has 
𝐴
A patties and 
𝐵
B buns. To make 
1
1 burger, Chef needs 
1
1 patty and 
1
1 bun.
Find the maximum number of burgers that Chef can make.

Input Format
The first line of input will contain an integer 
𝑇
T — the number of test cases. The description of 
𝑇
T test cases follows.
The first and only line of each test case contains two space-separated integers 
𝐴
A and 
𝐵
B, the number of patties and buns respectively.
Output Format
For each test case, output the maximum number of burgers that Chef can make.

Constraints
1
≤
𝑇
≤
1000
1≤T≤1000
1
≤
𝐴
,
𝐵
≤
1
0
5
1≤A,B≤10 
5
 
Sample 1:
Input
Output
4
2 2
2 3
3 2
23 17
2
2
2
17
Explanation:
Test case 
1
1: Chef has 
2
2 patties and 
2
2 buns, and therefore Chef can make 
2
2 burgers.

Test case 
2
2: Chef has 
2
2 patties and 
3
3 buns. Chef can make at most 
2
2 burgers by using 
2
2 patties and 
2
2 buns.

Test case 
3
3: Chef has 
3
3 patties and 
2
2 buns. Chef can make at most 
2
2 burgers by using 
2
2 patties and 
2
2 buns.

Test case 
4
4: Chef has 
23
23 patties and 
17
17 buns. Chef can make at most 
17
17 burgers by using 
17
17 patties and 
17
17 buns.

----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Q11)Who is taller!
Alice and Bob were having an argument about which of them is taller than the other. Charlie got irritated by the argument, and decided to settle the matter once and for all.

Charlie measured the heights of Alice and Bob, and got to know that Alice's height is 
𝑋
X centimeters and Bob's height is 
𝑌
Y centimeters. Help Charlie decide who is taller.

It is guaranteed that 
𝑋
≠
𝑌
X=Y.

Input Format
The first line of input will contain an integer 
𝑇
T — the number of test cases. The description of 
𝑇
T test cases follows.
The first and only line of each test case contains two integers 
𝑋
X and 
𝑌
Y, as described in the problem statement.
Output Format
For each test case, output on a new line 
A
A if Alice is taller than Bob, else output 
B
B. The output is case insensitive, i.e, both 
A
A and 
a
a will be accepted as correct answers when Alice is taller.

Constraints
1
≤
𝑇
≤
1000
1≤T≤1000
100
≤
𝑋
,
𝑌
≤
200
100≤X,Y≤200
𝑋
≠
𝑌
X=Y
Sample 1:
Input
Output
2
150 160
160 150
B
A
Explanation:
Test case 
1
1: In this case, 
150
<
160
150<160 so Bob is taller than Alice.

Test case 
2
2: In this case, 
160
>
150
160>150 so Alice is taller than Bob.

----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Q12)My very 1st contest!
Each contest - there are approximately 1500 - 2000 users who participate for the 1st time and get rated.

The Chef wanted to tell new users some tricks for their 1st contest:

Before the contest - you don’t have any rating. So even if you make a single submission - you will become part of the contest rank list and you will get a rating.
If you want your rating to increase - give the entire 2 hours to the contest & don’t quit! If you keep trying till the end, and the more time you get, the more problems you can solve. That means larger rating increases!
Do not ask your friends for their code. If you copy paste their code, you will get caught during plagiarism checks and your rating will be reduced by 275 points, along with a permanent black mark on your profile.
Now to the problem:

In a contest where 
𝑁
N new users visited the contest,

𝐴
A users just saw the problems and didn’t make any submissions and hence won’t get any rating.
𝐵
B users who made a submission but could not solve any problem correctly. Thus, after the contest, they will get a rating in the range 
800
−
1000
800−1000.
Everyone else could correctly solve at least 
1
1 problem. Thus, they will get a rating strictly greater than 
1000
1000 after the contest.
You need to output the number of new users in the contest who, after the contest, will get a rating and also the number of new users who will get a rating strictly greater than 
1000
1000.

Input Format
Each input file contains of a single line, with three integers 
𝑁
,
𝐴
N,A and 
𝐵
B - the number of new users, the number of users who just saw the problem and didn't make any submission, and the number of users who made a submission but could not solve any problem correctly.
Output Format
Output two integers separated by a space in a single line - the number of new users who will get a rating at the end of the contest and the number of new users who will get a rating higher than 
1000
1000.

Constraints
2
≤
𝑁
≤
1000
2≤N≤1000
1
≤
𝐴
≤
1000
1≤A≤1000
1
≤
𝐵
≤
1000
1≤B≤1000
𝐴
+
𝐵
≤
𝑁
A+B≤N
Sample 1:
Input
Output
10 3 2
7 5
Explanation:
There were 
10
10 new users. Among those 
10
10, 
3
3 didn't make any submissions. This means that the other 
10
−
3
=
7
10−3=7 users made submissions and will get a rating. This is the first integer of the output.

Now, among these 
7
7 users, 
2
2 couldn't solve any problem even though they submitted and tried. So, they will get a rating less than equal to 
1000
1000. The other 
7
−
2
=
5
7−2=5 users were able to solve at least 
1
1 problem and hence will get a rating greater than 
1000
1000. Hence, the second integer of the output is 
5
5.

Sample 2:
Input
Output
10 4 1
6 5
Explanation:
There were 
10
10 new users. Among those 
10
10, 
4
4 didn't make any submissions. This means that the other 
10
−
4
=
6
10−4=6 users made submissions and will get a rating. This is the first integer of the output.

Now, among these 
6
6 users, 
1
1 couldn't solve any problem even though they submitted and tried. So, they will get a rating less than equal to 
1000
1000. The other 
6
−
1
=
5
6−1=5 users were able to solve at least 
1
1 problem and hence will get a rating greater than 
1000
1000. Hence, the second integer of the output is 
5
5.

Sample 3:
Input
Output
20 1 2
19 17
Explanation:
There were 
20
20 new users. Among those 
20
20, 
1
1 didn't make any submissions. This means that the other 
20
−
1
=
19
20−1=19 users made submissions and will get a rating. This is the first integer of the output.

Now, among these 
19
19 users, 
2
2 couldn't solve any problem even though they submitted and tried. So, they will get a rating less than equal to 
1000
1000. The other 
19
−
2
=
17
19−2=17 users were able to solve at least 
1
1 problem and hence will get a rating greater than 
1000
1000. Hence, the second integer of the output is 
17
17.

Sample 4:
Input
Output
1000 300 700
700 0
Explanation:
There were 
1000
1000 new users. Among those 
1000
1000, 
300
300 didn't make any submissions. This means that the other 
1000
−
300
=
700
1000−300=700 users made submissions and will get a rating. This is the first integer of the output.

Now, among these 
700
700 users, 
700
700 couldn't solve any problem even though they submitted and tried. So, they will get a rating less than equal to 
1000
1000. The other 
700
−
700
=
0
700−700=0 users were able to solve at least 
1
1 problem and hence will get a rating greater than 
1000
1000. Hence, the second integer of the output is 
0
0.

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Q13)Roller Coaster
Chef's son wants to go on a roller coaster ride. The height of Chef's son is 
𝑋
X inches while the minimum height required to go on the ride is 
𝐻
H inches. Determine whether he can go on the ride or not.

Input Format
The first line contains a single integer 
𝑇
T - the number of test cases. Then the test cases follow.
The first and only line of each test case contains two integers 
𝑋
X and 
𝐻
H - the height of Chef's son and the minimum height required for the ride respectively.
Output Format
For each test case, output in a single line, YES if Chef's son can go on the ride. Otherwise, output NO.

You may print each character of YES and NO in uppercase or lowercase (for example, yes, yEs, Yes will be considered identical)

Constraints
1
≤
𝑇
≤
1000
1≤T≤1000
1
≤
𝑋
,
𝐻
≤
100
1≤X,H≤100
Sample 1:
Input
Output
4
15 20
50 48
32 32
38 39
NO
YES
YES
NO
Explanation:
Test case 1: Chef's son can not go on the ride as his height 
<
< the minimum required height.

Test case 2: Chef's son can go on the ride as his height 
≥
≥ the minimum required height.

Test case 3: Chef's son can go on the ride as his height 
≥
≥ the minimum required height.

Test case 4: Chef's son can not go on the ride as his height 
<
< the minimum required height.

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Q14)Chef and Brain Speed
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
Sample 1:
Input
Output
7 9
YES
Explanation:
Chef's current brain speed of 
9
9 bps is greater than the threshold of 
7
7 bps, hence Chef is prone to errors.

Sample 2:
Input
Output
6 6
NO
Explanation:
Chef's current brain speed of 
6
6 bps is not greater than the threshold of 
6
6 bps, hence Chef is not prone to errors.

Sample 3:
Input
Output
31 53
YES
Explanation:
Chef's current brain speed of 
53
53 bps is greater than the threshold of 
31
31 bps, hence Chef is prone to errors.

Sample 4:
Input
Output
53 8
NO
Explanation:
Chef's current brain speed of 
8
8 bps is not greater than the threshold of 
53
53 bps, hence Chef is not prone to errors.

---------------------------------------------------------------------------------------------------------------------------------------------------------------
Q15)Chef On Date
Chef and his girlfriend go on a date. Chef took 
𝑋
X dollars with him, and was quite sure that this would be enough to pay the bill. At the end, the waiter brought a bill of 
𝑌
Y dollars. Print "YES" if Chef has enough money to pay the bill, or "NO" if he has to borrow from his girlfriend and leave a bad impression on her.

Input Format
The first line of input will contain a single integer 
𝑇
T, denoting the number of test cases.
Each test case consists of a single line of input, containing two space-separated integers 
𝑋
X and 
𝑌
Y.
Output Format
For each test case, output on a new line "YES" if Chef has enough money to pay the bill and "NO" otherwise.

You may print each character of the string in either uppercase or lowercase (for example, the strings "yEs", "yes", "Yes" and "YES" will all be treated as identical).

Constraints
1
≤
𝑇
≤
100
1≤T≤100
1
≤
𝑋
,
𝑌
≤
100
1≤X,Y≤100
Sample 1:
Input
Output
4
1 1
1 2
2 1
50 100
YES
NO
YES
NO
Explanation:
Test case 
1
1: Since the money Chef has is equal to the bill, he will be able to pay the bill.

Test case 
2
2: Since the money Chef has is less than the bill, he will have to borrow from his girlfriend and leave a bad impression on her.

Test case 
3
3: Since the money Chef has is greater than the bill, he will be able to pay the bill.

Test case 
4
4: Since the money Chef has is less than the bill, he will have to borrow from his girlfriend and leave a bad impression on her.
---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

Q16)Counting Words
Harsh was recently gifted a book consisting of 
𝑁
N pages. Each page contains exactly 
𝑀
M words printed on it. As he was bored, he decided to count the number of words in the book.

Help Harsh find the total number of words in the book.

Input Format
The first line of input will contain a single integer 
𝑇
T, denoting the number of test cases.
Each test case consists of two space-separated integers on a single line, 
𝑁
N and 
𝑀
M — the number of pages and the number of words on each page, respectively.
Output Format
For each test case, output on a new line, the total number of words in the book.

Constraints
1
≤
𝑇
≤
100
1≤T≤100
1
≤
𝑁
≤
100
1≤N≤100
1
≤
𝑀
≤
100
1≤M≤100
Sample 1:
Input
Output
4
1 1
4 2
2 4
95 42
1
8
8
3990
Explanation:
Test case 
1
1: The book consists of only 
1
1 page, and each page has only 
1
1 word. Hence, the total number of words is 
1
1.

Test case 
2
2: The book consists of 
4
4 pages, and each page has 
2
2 words. Hence, the total number of words is 
2
+
2
+
2
+
2
=
8
2+2+2+2=8.

Test case 
3
3: The book consists of 
2
2 pages, and each page has 
4
4 words. Hence, the total number of words is 
4
+
4
=
8
4+4=8.

Test case 
4
4: The book consists of 
95
95 pages, and each page has 
42
42 words. Hence, the total number of words is 
3990
3990.
