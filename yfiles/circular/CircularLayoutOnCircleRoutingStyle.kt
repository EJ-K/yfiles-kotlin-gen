// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.circular

/**
 * Routing style enumeration for edges between neighbors in the same partition of the [CircularLayout].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CircularLayoutOnCircleRoutingStyle">Online Documentation</a>
 */

sealed external class CircularLayoutOnCircleRoutingStyle {
  /**
   * A routing style constant specifying that edges between neighboring nodes should be straight lines.
   * 
   * Value - `0`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CircularLayoutOnCircleRoutingStyle%23STRAIGHT_LINE">Online Documentation</a>
   */
  object STRAIGHT_LINE: CircularLayoutOnCircleRoutingStyle
  
  /**
   * A routing style constant specifying that edges between neighboring nodes of a partition are curved towards the circle's center.
   * 
   * Value - `1`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CircularLayoutOnCircleRoutingStyle%23CURVED">Online Documentation</a>
   */
  object CURVED: CircularLayoutOnCircleRoutingStyle
  
  /**
   * A routing style constant specifying that edges between neighboring nodes of a partition are curved outwards on the circle's border.
   * 
   * Value - `2`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CircularLayoutOnCircleRoutingStyle%23ON_CIRCLE">Online Documentation</a>
   */
  object ON_CIRCLE: CircularLayoutOnCircleRoutingStyle
}
