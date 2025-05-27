// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

import yfiles.graph.IModelItem
import yfiles.lang.ClassMetadata
import yfiles.styles.IEdgeStyle
import yfiles.styles.ILabelStyle
import yfiles.styles.INodeStyle
import yfiles.styles.IPortStyle

/**
 * A [SelectionIndicatorManager] for graph items that supports using styles to indicate the selection.
 * @see [GraphFocusIndicatorManager]
 * @see [GraphHighlightIndicatorManager]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSelectionIndicatorManager">Online Documentation</a>
 * 
 * @constructor Creates a new instance that for all selected items in the model dynamically installs a selection indicator visualization.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSelectionIndicatorManager%23GraphSelectionIndicatorManager-constructor-GraphSelectionIndicatorManager">Online Documentation</a>
 */
external open class GraphSelectionIndicatorManager  () : SelectionIndicatorManager<IModelItem> {

/**
 * Gets or sets the style to use for the edge selection rendering.
 * 
 * The default value is `null`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSelectionIndicatorManager%23edgeStyle">Online Documentation</a>
 */
final var edgeStyle: IEdgeStyle?
/**
 * Gets or sets the style to use for the label selection rendering.
 * 
 * The default value is `null`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSelectionIndicatorManager%23labelStyle">Online Documentation</a>
 */
final var labelStyle: ILabelStyle?
/**
 * Gets or sets the style to use for the node selection rendering.
 * 
 * The default value is `null`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSelectionIndicatorManager%23nodeStyle">Online Documentation</a>
 */
final var nodeStyle: INodeStyle?
/**
 * Gets or sets the style to use for the port selection rendering.
 * 
 * The default value is `null`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSelectionIndicatorManager%23portStyle">Online Documentation</a>
 */
final var portStyle: IPortStyle?
/**
 * Called by [ModelManager.installItem] to retrieve the installer for a given item.
 * @param [item] The item to find an installer for.
 * @return An installer or `null`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSelectionIndicatorManager%23GraphSelectionIndicatorManager-method-getInstaller">Online Documentation</a>
 */
 override   fun getInstaller( item: IModelItem ):ICanvasObjectInstaller<IModelItem>?

companion object : ClassMetadata<GraphSelectionIndicatorManager> {
}
}

inline fun GraphSelectionIndicatorManager(
    block: GraphSelectionIndicatorManager.() -> Unit
): GraphSelectionIndicatorManager {
    return GraphSelectionIndicatorManager()
        .apply(block)
}
