import pytest 
def testsum():
    a,b = 4,9
    sum=a+b
    assert sum==13

def testdiff():
    a,b=9,4
    diff=a-b
    assert diff==5

def testprod():
    a,b=20,3
    prod=a*b
    assert prod==60

def test_quot():
    a,b=8,2
    quot=a/b
    assert quot==6

def test_greater():
    x = 2
    y = 5
    assert y > x

def test_greater_equal():
    x = 6
    y = 6
    assert y >= x

#use pytest -k greater for selective execition of test cases