import requests
import sys

#url = 'https://api.github.com/repos/{組織名}/{リポジトリ名}/pulls?state=all&per_page=100'
url = sys.argv[1] + sys.argv[2] + '&per_page=' + sys.argv[3]
headers={'Authorization': 'token ' + sys.argv[4]}

r = requests.get(url, headers=headers)
dic = r.headers

try:
    print(dic["link"])
except Exception:
    print("nolink")
