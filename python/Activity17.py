import pandas 
data={
    "Usernames":["Admin","Charles","Deku"],
    "Passwords":["password","Charl13","AllMight"]
}
dataframe=pandas.DataFrame(data)
dataframe.to_csv("a17.csv",index=False)