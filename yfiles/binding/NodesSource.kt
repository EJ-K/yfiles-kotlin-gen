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
 * A class that accepts a collection of objects from the [GraphBuilder] to build [INode][yfiles.graph.INode]s from.
 * @param [TDataItem] The type of the data items in the source.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodesSource">Online Documentation</a>
 * 
 * @constructor Creates a new source with the given `nodeCreator`.
 * @param [nodeCreator] The creator that is used to create the nodes of this source.
 * @param [idProvider] An optional function that yields an id for each element of the associated data collection in the [GraphBuilder].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodesSource%23NodesSource-constructor-NodesSource">Online Documentation</a>
 * 
 * @property nodeCreator
 * Gets or sets the [NodeCreator] for this source which can be used to adjust the creation behavior.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodesSource%23nodeCreator">Online Documentation</a>
 * 
 * @property idProvider
 * Gets or sets a provider that yields an id for each element of the associated data collection in the [GraphBuilder].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodesSource%23idProvider">Online Documentation</a>
 */
external open class NodesSource<TDataItem>  (
final var nodeCreator: NodeCreator<TDataItem>,
final var idProvider: IdProvider<TDataItem>? = definedExternally) : YObject {

/**
 * Gets or sets a provider that yields a parent id for each element of the associated data collection in the [GraphBuilder].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodesSource%23parentIdProvider">Online Documentation</a>
 */
final var parentIdProvider: Provider<TDataItem, Any>?
/**
 * Binds a collection of child data items to the given `childNodesSource`.
 * @param [TChildDataItem] The type of the child data items in the source.
 * @param [childDataProvider] A function that yields a child data item for each element of the associated data collection in the [GraphBuilder].
 * @param [childNodesSource] The child node source to which the child data is bound.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodesSource%23NodesSource-method-addChildNodesSource">Online Documentation</a>
 */
 final   fun <TChildDataItem>addChildNodesSource( childDataProvider: Provider<TDataItem, Any> ,
 childNodesSource: NodesSource<TChildDataItem> )
/**
 * Binds a provider for parents data items to the given `nodeSource`.
 * @param [TParentDataItem] The type of the parent data items in the source.
 * @param [parentDataProvider] A function that yields a parent data item for each element of the associated data collection in the [GraphBuilder].
 * @param [nodeSource] The node source to which the parent data is bound.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodesSource%23NodesSource-method-addParentNodesSource">Online Documentation</a>
 */
 final   fun <TParentDataItem>addParentNodesSource( parentDataProvider: Provider<TDataItem, TParentDataItem> ,
 nodeSource: NodesSource<TParentDataItem> )
/**
 * Registers a collection of child data items functioning as child entities for the [NodeCreator] of the returned [NodesSource].
 * @param [TChildDataItem] The type of the child data items in the source.
 * @param [childDataProvider] A function that yields a child data item for each element of the associated data collection in the [GraphBuilder].
 * @param [idProvider] An optional function that yields an id for each element of the associated data collection in the [GraphBuilder].
 * @return A new [NodesSource] instance that can be used to further customize the creation of child nodes, e.g. provide specific [style defaults][NodeCreator.defaults].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodesSource%23NodesSource-method-createChildNodesSource">Online Documentation</a>
 */
 final   fun <TChildDataItem>createChildNodesSource( childDataProvider: Provider<TDataItem, Any> ,
 idProvider: IdProvider<TChildDataItem>?  = definedExternally):NodesSource<TChildDataItem>
/**
 * Registers a collection of data items functioning as implicit parent entities for the [NodeCreator] of the returned [NodesSource].
 * @param [TParentDataItem] The type of the group data items in the source.
 * @param [parentDataProvider] A function that yields a parent data item for each element of the associated data collection in the [GraphBuilder].
 * @param [idProvider] An optional function that yields a unique id for each object returned by `parentDataProvider` This allows to create stable hierarchies even if the actual data items are not referentially equal.
 * @return A new [NodesSource] instance that can be used to further customize the creation of group nodes, e.g. provide specific [style defaults][NodeCreator.defaults].
 * @see [addParentNodesSource]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodesSource%23NodesSource-method-createParentNodesSource">Online Documentation</a>
 */
 final   fun <TParentDataItem>createParentNodesSource( parentDataProvider: Provider<TDataItem, TParentDataItem> ,
 idProvider: IdProvider<TParentDataItem>?  = definedExternally):NodesSource<TParentDataItem>
/**
 * Optionally obtains the id for the [parent][yfiles.graph.IGraph.getParent] or `null` given each data item for which a node is created.
 * @param [dataItem] A single data item from the associated data collection in the [GraphBuilder].
 * @return The id of another node or `null` in case the node should be put in the root of the hierarchy.
 * @see [parentIdProvider]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodesSource%23NodesSource-method-getParentId">Online Documentation</a>
 */
 open protected   fun getParentId( dataItem: TDataItem ):Any?

companion object : ClassMetadata<NodesSource<*>> {
}
}
