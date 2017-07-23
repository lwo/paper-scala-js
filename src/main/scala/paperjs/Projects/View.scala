package paperjs
package Projects

import org.scalajs.dom._
import paperjs.Basic._

import scala.scalajs.js

/**
 * Created by yoelusa on 25/04/15.
 */

@js.native
trait View extends EventHandling[View] {
  val element: raw.HTMLCanvasElement = js.native
  val pixelRatio: Double = js.native
  val resolution: Double = js.native
  var viewSize: Size = js.native
  def bounds: Rect = js.native
  def size: Size = js.native
  var center: Point = js.native
  var zoom: Double = js.native

  // Event Handlers

  var onFrame: js.ThisFunction1[View, FrameEvent, Unit] = js.native
  var onResize: js.ThisFunction1[View, FrameEvent, Unit] = js.native

  // Methods

  def draw(): Unit = js.native
  def remove(): Unit = js.native
  def isVisible: Boolean = js.native
  def scrollBy(point: Point): Unit = js.native
  def play(): Unit = js.native
  def update(): Unit =js.native
  def projectToView(point: Point): Point = js.native
  def viewToProject(point: Point): Point = js.native
}
