// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.geometry

import js.array.ReadonlyArray
import yfiles.lang.ClassMetadata

/**
 * A class that is used by [GeneralPath] to iterate over the elements the path is made up of.
 * @see [GeneralPath.createCursor]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GeneralPathCursor">Online Documentation</a>
 */
external class GeneralPathCursor private constructor()  {
  /**
   * Gets the current end point of the last path element.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GeneralPathCursor%23currentEndPoint">Online Documentation</a>
   */
  final val currentEndPoint: Point
  
  /**
   * Gets the current x coordinate of the last path element.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GeneralPathCursor%23currentEndPointX">Online Documentation</a>
   */
  final val currentEndPointX: Double
  
  /**
   * Gets the current y coordinate of the last path element.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GeneralPathCursor%23currentEndPointY">Online Documentation</a>
   */
  final val currentEndPointY: Double
  
  /**
   * Gets the current position of the cursor.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GeneralPathCursor%23index">Online Documentation</a>
   */
  final val index: Int
  
  /**
   * Gets the type of the path at the position of the cursor.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GeneralPathCursor%23pathType">Online Documentation</a>
   */
  final val pathType: PathType
  
  /**
   * Places the coordinates for the current type into the given array.
   * @param [coordinates] The coordinates. The array needs to have a length of at least 6, since [CUBIC_TO][PathType] needs six coordinates. If the path has been flattened, a length of two suffices.
   * @return The current type of the path element.
   * @see [getCurrentEndPoint]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GeneralPathCursor%23GeneralPathCursor-method-getCurrent">Online Documentation</a>
   */
  fun getCurrent(
    coordinates: ReadonlyArray<Double>,
  ): PathType
  
  /**
   * Places the current end coordinates of the last path element into the array.
   * @param [coordinates] An array with a length of at least 2.
   * @return The type of the current element.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GeneralPathCursor%23GeneralPathCursor-method-getCurrentEndPoint">Online Documentation</a>
   */
  fun getCurrentEndPoint(
    coordinates: ReadonlyArray<Double>,
  ): PathType
  
  /**
   * Advances the cursor to the next position if possible.
   * @return Whether the cursor has been moved successfully. `false` if the cursor has been moved beyond the end of the path.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GeneralPathCursor%23GeneralPathCursor-method-moveNext">Online Documentation</a>
   */
  fun moveNext(): Boolean
  
  /**
   * Moves the cursor to the previous position in the path.
   * @return Whether the move was successful.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GeneralPathCursor%23GeneralPathCursor-method-movePrevious">Online Documentation</a>
   */
  fun movePrevious(): Boolean
  
  /**
   * Reset the cursor to point to the beginning of the path.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GeneralPathCursor%23GeneralPathCursor-method-reset">Online Documentation</a>
   */
  fun reset()
  
  /**
   * Resets the cursor to point to the last element in the path.
   * @return Whether the cursor has been moved successfully.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GeneralPathCursor%23GeneralPathCursor-method-toLast">Online Documentation</a>
   */
  fun toLast(): Boolean
  
  companion object : ClassMetadata<GeneralPathCursor> {
  }
}
