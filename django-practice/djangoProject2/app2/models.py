from django.db import models

# Create your models here.
class App2(models.Model):
    no = models.IntegerField(100)
    size = models.IntegerField(100)
    maker = models.CharField(max_length=255)
    color = models.CharField(max_length=255)

    def __str__(self):
        return str(self.no) + ", " + \
               str(self.size) + ", " + \
               self.maker + ", " + \
               self.color
