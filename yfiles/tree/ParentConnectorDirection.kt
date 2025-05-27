// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.tree

/**
 * Specifies the possible directions in which a connector to a parent node can be placed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ParentConnectorDirection">Online Documentation</a>
 */

sealed external class ParentConnectorDirection {
  /**
   * Direction specifier which indicates that no connector should be calculated.
   * 
   * Value - `-2`
   * @see [ISubtreePlacer.placeSubtree]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ParentConnectorDirection%23NONE">Online Documentation</a>
   */
  object NONE: ParentConnectorDirection
  
  /**
   * Direction specifier which indicates that any direction can be used for the connector to the parent node.
   * 
   * Value - `-1`
   * @see [ISubtreePlacer.placeSubtree]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ParentConnectorDirection%23ANY">Online Documentation</a>
   */
  object ANY: ParentConnectorDirection
  
  /**
   * Direction specifier which indicates that the connector to the parent node should end in a segment that can be extended by a segment that goes up.
   * 
   * Value - `0`
   * @see [ISubtreePlacer.placeSubtree]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ParentConnectorDirection%23UP">Online Documentation</a>
   */
  object UP: ParentConnectorDirection
  
  /**
   * Direction specifier which indicates that the connector to the parent node should end in a segment that can be extended by a segment that goes right.
   * 
   * Value - `1`
   * @see [ISubtreePlacer.placeSubtree]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ParentConnectorDirection%23RIGHT">Online Documentation</a>
   */
  object RIGHT: ParentConnectorDirection
  
  /**
   * Direction specifier which indicates that the connector to the parent node should end in a segment that can be extended by a segment that goes down.
   * 
   * Value - `2`
   * @see [ISubtreePlacer.placeSubtree]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ParentConnectorDirection%23DOWN">Online Documentation</a>
   */
  object DOWN: ParentConnectorDirection
  
  /**
   * Direction specifier which indicates that the connector to the parent node should end in a segment that can be extended by a segment that goes left.
   * 
   * Value - `3`
   * @see [ISubtreePlacer.placeSubtree]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ParentConnectorDirection%23LEFT">Online Documentation</a>
   */
  object LEFT: ParentConnectorDirection
}
