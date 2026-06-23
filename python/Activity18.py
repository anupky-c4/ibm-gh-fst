import pandas
dataframe = pandas.read_csv('a17.csv')
print(dataframe)

print("Usernames:")
print(dataframe["Usernames"])
 
print("Username: ", dataframe["Usernames"][1], " | ", "Password: ", dataframe["Passwords"][1])

print("\nData sorted in ascending Usernames:")
print(dataframe.sort_values('Usernames'))

print("\nData sorted in descending Passwords:")
print(dataframe.sort_values('Usernames', ascending=False))