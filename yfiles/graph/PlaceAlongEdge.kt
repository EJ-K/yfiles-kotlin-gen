// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graph

/**
 * Enumeration that is used by [EdgeSegmentLabelModel] and [SmartEdgeLabelModel] to indicate the position of the label along the edge.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PlaceAlongEdge">Online Documentation</a>
 */

sealed external class PlaceAlongEdge {
  /**
   * The segment index is counted from the edge source.
   * 
   * Value - `1`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PlaceAlongEdge%23AT_SOURCE">Online Documentation</a>
   */
  object AT_SOURCE: PlaceAlongEdge
  
  /**
   * The segment index is counted from the edge target.
   * 
   * Value - `2`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PlaceAlongEdge%23AT_TARGET">Online Documentation</a>
   */
  object AT_TARGET: PlaceAlongEdge
  
  /**
   * The label is at the center of the edge and the segment index is ignored.
   * 
   * Value - `4`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PlaceAlongEdge%23AT_CENTER">Online Documentation</a>
   */
  object AT_CENTER: PlaceAlongEdge
}
