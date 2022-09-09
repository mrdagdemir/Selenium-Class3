package com.syntax.class03;

public class Notes {
    /*
    Selenium Class 3

Why do we need Xpath and CSS Selector?
-- developers may not provide all the locators in html
-- by using xpath and css we can identify elements with any given attributes

What is an Xpath?
-- xpath is like a query language which helps us to identify elements
uniquely on the web page

Types of Xpath:
Absolute Xpath --> starts from the starting node of the html
                    it always starts with single slash (/)
                    e.g /html/body/div/div/div

Relative Xpath --> starts from any node in html
                    it always starts with double slash (//)

Syntax for relative xpath:
//tagname[@attribute = 'attribute value']

e.g. //input[@id = 'email']

Identifying elements by its text:
//tagname[text() = 'text value']

e.g. //a[text() = 'Create new account']
//h2[text() = 'Connect with friends and the world around you on Facebook.']

identifying elements by using contains method:
//tagname[contains(@attribute, 'partial attribute value')]

e.g. //input[contains(@placeholder, 'Email')]
//h2[contains(text(), 'the world')]

starts-with will identify elements by its partial starting value
//tagname[starts-with(@attribute, 'partial starting attribute value')]

e.g. //input[starts-with(@aria-label, 'Email')]

ends-with was used in xpath 1.0, we are using 2.0 and this method is not available


Advanced Xpath:
is based on parent and child, sibling relationships

identifying element by following sibling
//tagname[@attribute = 'attribute value']/following-sibling::siblingTagname
e.g //input[@id = 'calFromDate']/following-sibling::img
//label[@for = 'leaveList_calFromDate']/following-sibling::img

identifying elements by preceding siblings
//tagname[@attribute = 'attribute value']/preceding-sibling::siblingTagname
e.g //span[text() = '& Orders']/preceding-sibling::span

identifying elements by its parent:
//tagname[@attribute = 'attribute value']/parent::parentTagname
//span[text() = '& Orders']/parent::a

identifying elements by its ancestors:
//input[@id = 'email']/ancestor::form

identifying elements by its index
(//img[@class = 'ui-datepicker-trigger'])[2]





     */
}
