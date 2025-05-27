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
 * Used by [GraphCopier] and [ClipboardGraphCopier] to indicate which types of objects should be [cloned][yfiles.lang.ICloneable] during copy operations.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CloneTypes">Online Documentation</a>
 */

external class CloneTypes private constructor(): YFlags<CloneTypes> {
  companion object {
    /**
     * Indicates that nothing should be cloned.
     * 
     * Value - `0`
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CloneTypes%23NONE">Online Documentation</a>
     */
    val NONE: CloneTypes
    
    /**
     * Indicates that [INodeStyle][yfiles.styles.INodeStyle]s should be cloned when their node is copied.
     * 
     * Value - `1`
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CloneTypes%23NODE_STYLE">Online Documentation</a>
     */
    val NODE_STYLE: CloneTypes
    
    /**
     * Indicates that [IEdgeStyle][yfiles.styles.IEdgeStyle]s should be cloned when their edge is copied.
     * 
     * Value - `2`
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CloneTypes%23EDGE_STYLE">Online Documentation</a>
     */
    val EDGE_STYLE: CloneTypes
    
    /**
     * Indicates that [IPortStyle][yfiles.styles.IPortStyle]s should be cloned when their port is copied.
     * 
     * Value - `4`
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CloneTypes%23PORT_STYLE">Online Documentation</a>
     */
    val PORT_STYLE: CloneTypes
    
    /**
     * Indicates that [ILabelStyle][yfiles.styles.ILabelStyle]s should be cloned when their label is copied.
     * 
     * Value - `8`
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CloneTypes%23LABEL_STYLE">Online Documentation</a>
     */
    val LABEL_STYLE: CloneTypes
    
    /**
     * Indicates that [tag][yfiles.collections.ITagOwner]s should be cloned when their owner is copied.
     * 
     * Value - `16`
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CloneTypes%23TAGS">Online Documentation</a>
     */
    val TAGS: CloneTypes
    
    /**
     * A combination of all flags in this enumeration.
     * 
     * Value - `255`
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CloneTypes%23ALL">Online Documentation</a>
     */
    val ALL: CloneTypes
  }
}
