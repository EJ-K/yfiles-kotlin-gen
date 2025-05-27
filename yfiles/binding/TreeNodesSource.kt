// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.binding

import yfiles.lang.ClassMetadata
import yfiles.lang.YObject

/**
 * A class that accepts a collection of objects from the [TreeBuilder] to build [INode][yfiles.graph.INode]s from.
 * @param [TDataItem] The type of the data items in the source.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeNodesSource">Online Documentation</a>
 * 
 * @constructor Creates a new source with the given `nodeCreator` and `parentEdgeCreator`.
 * @param [nodeCreator] The creator that is used to create the nodes of this source.
 * @param [parentEdgeCreator] The creator that is used to create the edges of this source.
 * @param [idProvider] An optional function that yields an id for each element of the associated data collection in the [TreeBuilder].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeNodesSource%23TreeNodesSource-constructor-TreeNodesSource">Online Documentation</a>
 * 
 * @property nodeCreator
 * Gets or sets the [NodeCreator] for this source which can be used to adjust the creation behavior.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeNodesSource%23nodeCreator">Online Documentation</a>
 * 
 * @property parentEdgeCreator
 * Gets or sets the [NodeCreator] for this source which can be used to adjust the creation behavior of the edges between child nodes and their parents.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeNodesSource%23parentEdgeCreator">Online Documentation</a>
 * 
 * @property idProvider
 * Gets or sets a provider that yields an id for each element of the associated data collection in the [GraphBuilder].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeNodesSource%23idProvider">Online Documentation</a>
 */
external open class TreeNodesSource<TDataItem>  (
final var nodeCreator: NodeCreator<TDataItem>,
final var parentEdgeCreator: EdgeCreator<TDataItem>,
final var idProvider: IdProvider<TDataItem>? = definedExternally) : YObject {

/**
 * Gets or sets a provider that yields a parent id for each element of the associated data collection in the [GraphBuilder].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeNodesSource%23parentIdProvider">Online Documentation</a>
 */
final var parentIdProvider: Provider<TDataItem, Any>?
/**
 * Binds a collection of child data items to the given `nodesSource`.
 * @param [TChildDataItem] The type of the child data items in the source.
 * @param [childDataProvider] A function that yields a child data item for each element of the associated data collection in the [TreeBuilder].
 * @param [nodesSource] The child node source to which the child data is bound.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeNodesSource%23TreeNodesSource-method-addChildNodesSource">Online Documentation</a>
 */
 final   fun <TChildDataItem>addChildNodesSource( childDataProvider: Provider<TDataItem, Any> ,
 nodesSource: TreeNodesSource<TChildDataItem> )
/**
 * Registers a collection of child data items functioning as child entities for the [NodeCreator] of the returned [TreeNodesSource].
 * @param [TChildDataItem] The type of the child data items in the source.
 * @param [childDataProvider] A function that yields a child data item for each element of the associated data collection in the [TreeBuilder].
 * @param [idProvider] An optional function that yields an id for each element of the associated data collection in the [TreeBuilder].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeNodesSource%23TreeNodesSource-method-createChildNodesSource">Online Documentation</a>
 */
 final   fun <TChildDataItem>createChildNodesSource( childDataProvider: Provider<TDataItem, Any> ,
 idProvider: IdProvider<TChildDataItem>?  = definedExternally):TreeNodesSource<TChildDataItem>
/**
 * Optionally obtains the id for the [parent][yfiles.graph.IGraph.getParent] or `null` given each data item for which a node is created.
 * @param [dataItem] A single data item from the associated data collection in the [GraphBuilder].
 * @return The id of another node or `null` in case the node should be put in the root of the hierarchy.
 * @see [parentIdProvider]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeNodesSource%23TreeNodesSource-method-getParentId">Online Documentation</a>
 */
 open protected   fun getParentId( dataItem: TDataItem ):Any?

companion object : ClassMetadata<TreeNodesSource<*>> {
}
}
