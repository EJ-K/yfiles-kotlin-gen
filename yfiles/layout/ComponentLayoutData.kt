// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import yfiles.algorithms.AbortHandler
import yfiles.graph.INode
import yfiles.lang.ClassMetadata
import yfiles.lang.IComparable

/**
 * Specifies custom data for the [ComponentLayout].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ComponentLayoutData">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [ComponentLayoutData] which helps configuring [ComponentLayout].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ComponentLayoutData%23ComponentLayoutData-constructor-ComponentLayoutData">Online Documentation</a>
 */
external open class ComponentLayoutData  () : LayoutData {

/**
 * Gets or sets the [AbortHandler] used during the layout.
 * @see [LayoutExecutor.abortHandler]
 * @see [AbortHandler.ABORT_HANDLER_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ComponentLayoutData%23abortHandler">Online Documentation</a>
 */
final var abortHandler: AbortHandler?
/**
 * Gets or sets a collection of nodes that determine the components that shall be laid out.
 * @see [ComponentLayout.AFFECTED_COMPONENTS_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ComponentLayoutData%23affectedComponents">Online Documentation</a>
 */
final var affectedComponents: ItemCollection<INode>
/**
 * Gets or sets the mapping from nodes to their component comparable that is used to sort the components.
 * @see [ComponentLayout.COMPONENT_ID_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ComponentLayoutData%23componentIds">Online Documentation</a>
 */
final var componentIds: ItemMapping<INode, IComparable<*>>
/**
 * Gets or sets the mapping from nodes to their [NodeHalo].
 * @see [NodeHalo.NODE_HALO_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ComponentLayoutData%23nodeHalos">Online Documentation</a>
 */
final var nodeHalos: ItemMapping<INode, NodeHalo>
/**
 * Gets or sets the mapping from nodes to an object defining the node type, which is considered by selected component arrangement styles such that components that contain nodes of the same type are placed close to each other.
 * @see [LayoutKeys.NODE_TYPE_DP_KEY]
 * @see [ComponentArrangementStyles.ROWS]
 * @see [ComponentArrangementStyles.SINGLE_ROW]
 * @see [ComponentArrangementStyles.SINGLE_COLUMN]
 * @see [ComponentArrangementStyles.MULTI_ROWS_TYPE_SEPARATED]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ComponentLayoutData%23nodeTypes">Online Documentation</a>
 */
final var nodeTypes: ItemMapping<INode, INodeType>

companion object : ClassMetadata<ComponentLayoutData> {
}
}

inline fun ComponentLayoutData(
    block: ComponentLayoutData.() -> Unit
): ComponentLayoutData {
    return ComponentLayoutData()
        .apply(block)
}
