from django.http import HttpResponse
from django.shortcuts import render

# Create your views here.
# 장고에서는 views가 컨트롤러 역할
import bbs.models

def start(request):
    return HttpResponse('내가 리턴되는 내용임.')

def index(request):
    print('첫 번째 페이지 실행 요청!!')
    return render(request, 'bbs/index.html')

def insert(request):
    return render(request, 'bbs/insert.html')

def insert2(request):
    # post 방식으로 서버로 전달된 데이터를 받아야 한다
    data =  request.POST
    print(data)
    # 객체 생성해서 save() 호출
    one = bbs.models.Bbs()
    one.save()
    return HttpResponse('Ok')

def update(request):
    return render(request, 'bbs/update.html')

def update2(request):
    data = request.POST
    print(data)
    one = bbs.models.Bbs()
    one.save()
    return HttpResponse('Update')