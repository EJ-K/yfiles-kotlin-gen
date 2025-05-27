// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graph

import yfiles.lang.YFlags

/**
 * The modes used to detect group nodes to paste other nodes into.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ParentNodeDetectionModes">Online Documentation</a>
 */

external class ParentNodeDetectionModes private constructor(): YFlags<ParentNodeDetectionModes> {
  companion object {
    /**
     * Nodes should not be pasted into group nodes but are pasted top-level.
     * 
     * Value - `0`
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ParentNodeDetectionModes%23NONE">Online Documentation</a>
     */
    val NONE: ParentNodeDetectionModes
    
    /**
     * If exactly one group node is selected, the nodes should be pasted into that group.
     * 
     * Value - `1`
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ParentNodeDetectionModes%23SELECTION">Online Documentation</a>
     */
    val SELECTION: ParentNodeDetectionModes
    
    /**
     * A node should be pasted into the group node at the location where the node is pasted to.
     * 
     * Value - `2`
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ParentNodeDetectionModes%23AT_LOCATION">Online Documentation</a>
     */
    val AT_LOCATION: ParentNodeDetectionModes
    
    /**
     * A node should be pasted into its original parent or ancestor, if it has not been moved away too much.
     * 
     * Value - `4`
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ParentNodeDetectionModes%23PREVIOUS_PARENT">Online Documentation</a>
     */
    val PREVIOUS_PARENT: ParentNodeDetectionModes
  }
}
