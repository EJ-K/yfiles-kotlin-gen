// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

import yfiles.collections.IEnumerator
import yfiles.graph.IBend
import yfiles.graph.IEdge
import yfiles.graph.IGraph
import yfiles.graph.ILabel
import yfiles.graph.IModelItem
import yfiles.graph.INode
import yfiles.graph.IPort
import yfiles.lang.ClassMetadata
import yfiles.lang.EventHandler1

/**
 * An [IGraphSelection] implementation based on [DefaultSelectionModel]s for each item type.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSelection">Online Documentation</a>
 * 
 * @constructor Instantiates an instance using the graph as the model.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSelection%23GraphSelection-constructor-GraphSelection(IGraph)">Online Documentation</a>
 * 
 * @property graph
 * Gets or sets the [IGraph] this instance is using as the domain for the selection.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSelection%23graph">Online Documentation</a>
 */
external open class GraphSelection  (
final var graph: IGraph? = definedExternally) : IGraphSelection {

/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSelection%23selectedBends">Online Documentation</a>
 */
final override val selectedBends: ISelectionModel<IBend>
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSelection%23selectedEdges">Online Documentation</a>
 */
final override val selectedEdges: ISelectionModel<IEdge>
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSelection%23selectedLabels">Online Documentation</a>
 */
final override val selectedLabels: ISelectionModel<ILabel>
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSelection%23selectedNodes">Online Documentation</a>
 */
final override val selectedNodes: ISelectionModel<INode>
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSelection%23selectedPorts">Online Documentation</a>
 */
final override val selectedPorts: ISelectionModel<IPort>
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSelection%23GraphSelection-method-clear">Online Documentation</a>
 */
 final override   fun clear()
/**
 * Factory method that creates the [DefaultSelectionModel] to use for the bends.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSelection%23GraphSelection-method-createBendSelectionModel">Online Documentation</a>
 */
 open protected   fun createBendSelectionModel():DefaultSelectionModel<IBend>
/**
 * Factory method that creates the [DefaultSelectionModel] to use for the edges.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSelection%23GraphSelection-method-createEdgeSelectionModel">Online Documentation</a>
 */
 open protected   fun createEdgeSelectionModel():DefaultSelectionModel<IEdge>
/**
 * Factory method that creates the [DefaultSelectionModel] to use for the labels.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSelection%23GraphSelection-method-createLabelSelectionModel">Online Documentation</a>
 */
 open protected   fun createLabelSelectionModel():DefaultSelectionModel<ILabel>
/**
 * Factory method that creates the [DefaultSelectionModel] to use for the nodes.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSelection%23GraphSelection-method-createNodeSelectionModel">Online Documentation</a>
 */
 open protected   fun createNodeSelectionModel():DefaultSelectionModel<INode>
/**
 * Factory method that creates the [DefaultSelectionModel] to use for the ports.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSelection%23GraphSelection-method-createPortSelectionModel">Online Documentation</a>
 */
 open protected   fun createPortSelectionModel():DefaultSelectionModel<IPort>
/**
 * Returns an enumerator that iterates through the collection of all selected elements.
 * @return An [IEnumerator] object that can be used to iterate through all selected elements.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSelection%23GraphSelection-method-getEnumerator">Online Documentation</a>
 */
 final override   fun getEnumerator():IEnumerator<IModelItem>
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSelection%23GraphSelection-method-isSelected">Online Documentation</a>
 */
 override   fun isSelected( item: IModelItem ):Boolean
/**
 * Raises the [ItemSelectionChanged] event
 * @param [event] The parameters for the event
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSelection%23GraphSelection-method-onItemSelectionChanged">Online Documentation</a>
 */
 open protected   fun onItemSelectionChanged( event: ItemSelectionChangedEventArgs<IModelItem> )
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSelection%23GraphSelection-method-setSelected">Online Documentation</a>
 */
 override   fun setSelected( item: IModelItem ,
 selected: Boolean )
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSelection%23ItemSelectionChanged">Online Documentation</a>
 */
override fun addItemSelectionChangedListener(listener: EventHandler1<ItemSelectionChangedEventArgs<IModelItem>>)
override fun removeItemSelectionChangedListener(listener: EventHandler1<ItemSelectionChangedEventArgs<IModelItem>>)

companion object : ClassMetadata<GraphSelection> {
}
}

inline fun GraphSelection(
    block: GraphSelection.() -> Unit
): GraphSelection {
    return GraphSelection()
        .apply(block)
}
