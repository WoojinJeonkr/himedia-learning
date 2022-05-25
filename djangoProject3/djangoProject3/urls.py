"""djangoProject3 URL Configuration

The `urlpatterns` list routes URLs to views. For more information please see:
    https://docs.djangoproject.com/en/3.2/topics/http/urls/
Examples:
Function views
    1. Add an import:  from my_app import views
    2. Add a URL to urlpatterns:  path('', views.home, name='home')
Class-based views
    1. Add an import:  from other_app.views import Home
    2. Add a URL to urlpatterns:  path('', Home.as_view(), name='home')
Including another URLconf
    1. Import the include() function: from django.urls import include, path
    2. Add a URL to urlpatterns:  path('blog/', include('blog.urls'))
"""
from django.contrib import admin
from django.urls import path

import member.views

urlpatterns = [
    path('admin/', admin.site.urls),
    path('', member.views.start),
    path('member/', member.views.index),
    path('member/insert', member.views.insert),
    path('member/insert2', member.views.insert2),
    path('member/delete', member.views.delete),
    path('member/delete2', member.views.delete2),
    path('member/one', member.views.one),
    path('member/one2', member.views.one2),
    path('member/one22/<id>', member.views.one22),
    path('member/up/<id>', member.views.up),
    path('member/up2', member.views.up2),
    path('member/all', member.views.all),
    path('member/login', member.views.login),
    path('member/login2', member.views.login2),
    path('question/', member.views.q_index),
    path('question/q_insert', member.views.q_insert),
    path('question/q_insert2', member.views.q_insert2),
    path('question/q_delete', member.views.q_delete),
    path('question/q_delete2', member.views.q_delete2),
    path('question/q_update/<id>', member.views.q_update),
    path('question/q_update2', member.views.q_update2),
    path('question/q_one', member.views.q_one),
    path('question/q_one2', member.views.q_one2),
    path('question/q_one22/<id>', member.views.q_one22),
    path('question/q_all', member.views.q_all)
]
