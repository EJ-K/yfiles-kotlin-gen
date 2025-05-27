// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import yfiles.collections.ICollection
import yfiles.geometry.Point
import yfiles.lang.ClassMetadata

/**
 * Event arguments for the [collect-snap-results][SnapContext] event.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CollectSnapResultsEventArgs">Online Documentation</a>
 * 
 * @constructor Creates a new instance of the event arguments using the provided values for initialization.
 * @param [context] The context for which the event is queried.
 * @param [originalLocation] The original location of the mouse at the beginning of the gesture.
 * @param [newLocation] The new (current) location of the mouse.
 * @param [snapDistance] The zoom invariant snap distance.
 * @param [gridSnapDistance] The zoom invariant grid snap distance.
 * @param [snapResults] The collection to store the snap results in.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CollectSnapResultsEventArgs%23CollectSnapResultsEventArgs-constructor-CollectSnapResultsEventArgs">Online Documentation</a>
 * 
 * @property originalLocation
 * Gets the original location of the mouse at the beginning of the gesture.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CollectSnapResultsEventArgs%23originalLocation">Online Documentation</a>
 * 
 * @property newLocation
 * Gets the new (current) location of the mouse that is going to be manipulated by the snapping process.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CollectSnapResultsEventArgs%23newLocation">Online Documentation</a>
 * 
 * @property snapDistance
 * Gets the zoom invariant snap distance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CollectSnapResultsEventArgs%23snapDistance">Online Documentation</a>
 * 
 * @property gridSnapDistance
 * Gets the zoom invariant grid snap distance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CollectSnapResultsEventArgs%23gridSnapDistance">Online Documentation</a>
 */
open external class CollectSnapResultsEventArgs (
context: IInputModeContext,
final val originalLocation: Point,
final val newLocation: Point,
final val snapDistance: Double,
final val gridSnapDistance: Double,
snapResults: ICollection<out SnapResult>) : InputModeEventArgs {
  /**
   * Gets the vector by which the mouse has been moved since initialization of the snapping process.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CollectSnapResultsEventArgs%23delta">Online Documentation</a>
   */
  final val delta: Point
  
  /**
   * Adds a [SnapResult] to the collection of snap results.
   * @param [snapResult] The result to add.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CollectSnapResultsEventArgs%23CollectSnapResultsEventArgs-method-addSnapResult">Online Documentation</a>
   */
  open fun addSnapResult(
    snapResult: SnapResult?,
  )
  
  companion object : ClassMetadata<CollectSnapResultsEventArgs> {
  }
}
