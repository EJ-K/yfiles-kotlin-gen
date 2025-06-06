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
 * Determines the position of a label in the [NinePositionsEdgeLabelModel].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NinePositionsEdgeLabelModelPosition">Online Documentation</a>
 */

sealed external class NinePositionsEdgeLabelModelPosition {
  /**
   * Encodes a label position at the source above the edge.
   * 
   * Value - `17`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NinePositionsEdgeLabelModelPosition%23SOURCE_ABOVE">Online Documentation</a>
   */
  object SOURCE_ABOVE: NinePositionsEdgeLabelModelPosition
  
  /**
   * Encodes a label position at the target above the edge.
   * 
   * Value - `18`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NinePositionsEdgeLabelModelPosition%23TARGET_ABOVE">Online Documentation</a>
   */
  object TARGET_ABOVE: NinePositionsEdgeLabelModelPosition
  
  /**
   * Encodes a label position at the center above the edge.
   * 
   * Value - `20`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NinePositionsEdgeLabelModelPosition%23CENTER_ABOVE">Online Documentation</a>
   */
  object CENTER_ABOVE: NinePositionsEdgeLabelModelPosition
  
  /**
   * Encodes a label position at the source below the edge.
   * 
   * Value - `33`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NinePositionsEdgeLabelModelPosition%23SOURCE_BELOW">Online Documentation</a>
   */
  object SOURCE_BELOW: NinePositionsEdgeLabelModelPosition
  
  /**
   * Encodes a label position at the target below the edge.
   * 
   * Value - `34`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NinePositionsEdgeLabelModelPosition%23TARGET_BELOW">Online Documentation</a>
   */
  object TARGET_BELOW: NinePositionsEdgeLabelModelPosition
  
  /**
   * Encodes a label position at the center below the edge.
   * 
   * Value - `36`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NinePositionsEdgeLabelModelPosition%23CENTER_BELOW">Online Documentation</a>
   */
  object CENTER_BELOW: NinePositionsEdgeLabelModelPosition
  
  /**
   * Encodes a label position at the source of the edge that lies on the edge.
   * 
   * Value - `65`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NinePositionsEdgeLabelModelPosition%23SOURCE_CENTERED">Online Documentation</a>
   */
  object SOURCE_CENTERED: NinePositionsEdgeLabelModelPosition
  
  /**
   * Encodes a label position at the source of the edge that lies on the edge.
   * 
   * Value - `66`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NinePositionsEdgeLabelModelPosition%23TARGET_CENTERED">Online Documentation</a>
   */
  object TARGET_CENTERED: NinePositionsEdgeLabelModelPosition
  
  /**
   * Encodes a label position at the center of the edge that lies on the edge.
   * 
   * Value - `68`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NinePositionsEdgeLabelModelPosition%23CENTER_CENTERED">Online Documentation</a>
   */
  object CENTER_CENTERED: NinePositionsEdgeLabelModelPosition
}
