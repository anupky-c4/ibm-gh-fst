# # 5. Scrape the data in the table
# for tr in table.find_all('tr'):    # For all the rows in the table
#     cells = tr.find_all('td')      # find all the cells
#     row = [i.text for i in cells] # iterate through the cells and store the data in a list
#     print(row)                    # print the rows

import requests
from bs4 import BeautifulSoup

response = requests.get("https://www.training-support.net/webelements/tables")
soup = BeautifulSoup(response.content, "html.parser")
table = soup.find('table')

headers = []
data = []
for tr in table.find_all('tr'):
    th = tr.find_all('th')
    td = tr.find_all('td')

    if th:  # header row
        headers = [h.text.strip() for h in th]
    elif td:  # data rows
        row = [d.text.strip() for d in td]
        data.append(row)

# print("Headers:", headers)
print(headers)
# print("Rows:")
for row in data:
    print(row)

