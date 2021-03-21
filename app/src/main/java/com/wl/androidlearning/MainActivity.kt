package com.wl.androidlearning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.wl.androidlearning.designpattern.factory.FactoryProducer
import com.wl.androidlearning.designpattern.factory.ShapeFactory

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //工厂模式

//        var circle = ShapeFactory.createShape("circle")
//        var rectangle = ShapeFactory.createShape("rectangle")
//        var square = ShapeFactory.createShape("square")
//
//        circle?.draw()
//        rectangle?.draw()
//        square?.draw()

        //抽象工厂模式
        var shapeFactory = FactoryProducer.createFactory("shapeFactory")
        var circle = shapeFactory?.createShape("circle")
        var rectangle = shapeFactory?.createShape("rectangle")
        var square = shapeFactory?.createShape("square")

        circle?.draw()
        rectangle?.draw()
        square?.draw()

        var colorFactory = FactoryProducer.createFactory("colorFactory")
        var red = colorFactory?.createColor("red")
        var green = colorFactory?.createColor("green")
        var blue = colorFactory?.createColor("blue")

        red?.fill()
        green?.fill()
        blue?.fill()



        Log.d("test","newfdsfasdftest")
    }
}