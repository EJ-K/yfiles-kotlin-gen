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
 * Enumeration to indicate which items should be [cloned][yfiles.lang.ICloneable.clone] during copy operations.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CloneTypes">Online Documentation</a>
 */
external class CloneTypes 
    private constructor(): YFlags<CloneTypes> {
    companion object {
    /**
 * Indicates the [INodeStyle][yfiles.styles.INodeStyle] constant.
 * 
 * Value - `1`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CloneTypes%23NODE_STYLE">Online Documentation</a>
 */
val NODE_STYLE: CloneTypes
/**
 * Indicates the [IEdgeStyle][yfiles.styles.IEdgeStyle] constant.
 * 
 * Value - `2`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CloneTypes%23EDGE_STYLE">Online Documentation</a>
 */
val EDGE_STYLE: CloneTypes
/**
 * Indicates the [IPortStyle][yfiles.styles.IPortStyle] constant.
 * 
 * Value - `4`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CloneTypes%23PORT_STYLE">Online Documentation</a>
 */
val PORT_STYLE: CloneTypes
/**
 * Indicates the [ILabelStyle][yfiles.styles.ILabelStyle] constant.
 * 
 * Value - `8`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CloneTypes%23LABEL_STYLE">Online Documentation</a>
 */
val LABEL_STYLE: CloneTypes
/**
 * Indicates the [ILabelModelParameter] constant.
 * 
 * Value - `16`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CloneTypes%23LABEL_MODEL_PARAMETER">Online Documentation</a>
 */
val LABEL_MODEL_PARAMETER: CloneTypes
/**
 * Indicates the [IPortLocationModelParameter] constant.
 * 
 * Value - `32`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CloneTypes%23PORT_LOCATION_MODEL_PARAMETER">Online Documentation</a>
 */
val PORT_LOCATION_MODEL_PARAMETER: CloneTypes
/**
 * Indicates the [ITagOwner.tag] constant.
 * 
 * Value - `64`
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
