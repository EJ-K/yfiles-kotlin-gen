// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graph

import yfiles.geometry.Size
import yfiles.lang.InterfaceMetadata
import yfiles.lang.YObject
import yfiles.styles.INodeStyle

/**
 * Interface used by [IGraph] and the like to declare and obtain the defaults for nodes and their labels or ports.
 * @see [IGraph.nodeDefaults]
 * @see [IGraph.groupNodeDefaults]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/INodeDefaults">Online Documentation</a>
 */
external interface INodeDefaults : YObject {
/**
 * Gets or sets the defaults for labels at nodes.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/INodeDefaults%23labels">Online Documentation</a>
 */
var labels: ILabelDefaults
/**
 * Gets or sets the defaults for ports at nodes.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/INodeDefaults%23ports">Online Documentation</a>
 */
var ports: IPortDefaults
/**
 * Gets or sets a value indicating whether the [style] instance should be shared referentially or [cloned][yfiles.lang.ICloneable.clone] upon a call to [getStyleInstance].
 * @see [getStyleInstance]
 * @see [style]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/INodeDefaults%23shareStyleInstance">Online Documentation</a>
 */
var shareStyleInstance: Boolean
/**
 * Gets or sets the default node size.
 * @throws ArgumentError `value` contains one or more `NaN` values.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/INodeDefaults%23size">Online Documentation</a>
 */
var size: Size
/**
 * Gets or sets the style to use for nodes.
 * @see [shareStyleInstance]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/INodeDefaults%23style">Online Documentation</a>
 */
var style: INodeStyle
/**
 * Factory method that returns a style instance for use with newly created nodes.
 * @return The style to use, which for most implementations is either a [clone][yfiles.lang.ICloneable.clone] of or the [style] property, if [shareStyleInstance] is enabled.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/INodeDefaults%23INodeDefaults-method-getStyleInstance">Online Documentation</a>
 */
   fun getStyleInstance():INodeStyle

companion object : InterfaceMetadata<INodeDefaults> {
}
}
