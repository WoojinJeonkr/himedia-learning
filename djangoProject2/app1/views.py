from django.http import HttpResponse
from django.shortcuts import render

# Create your views here.
def start(request):
    return HttpResponse('리턴되었습니다.')

def index(request):
    print('첫번째 페이지 실행 요청!!!')
    return render(request, 'app1/index.html')