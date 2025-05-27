// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import yfiles.algorithms.EdgeDpKey
import yfiles.algorithms.GraphObjectDpKey
import yfiles.algorithms.ILabelLayoutDpKey
import yfiles.algorithms.NodeDpKey
import yfiles.graph.IEdge
import yfiles.graph.ILabel
import yfiles.graph.IModelItem
import yfiles.graph.INode
import yfiles.lang.ClassMetadata

/**
 * This class provides a way to easily pass custom item-specific data from an [IGraph][yfiles.graph.IGraph] to a [LayoutGraph].
 * @see [LayoutData]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GenericLayoutData">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [GenericLayoutData].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GenericLayoutData%23GenericLayoutData-constructor-GenericLayoutData">Online Documentation</a>
 */
external open class GenericLayoutData  () : LayoutData {

/**
 * Adds the data from one ore more other [LayoutData] instances to this instance.
 * @param [data] The data to add to this instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GenericLayoutData%23GenericLayoutData-method-add">Online Documentation</a>
 */
 final   fun add(vararg  data: LayoutData )
/**
 * Adds a set of [IEdge]s in the graph that will be passed to the [LayoutGraph]
 * @param [dpKey] The `string` key under which the [Boolean][yfiles.algorithms.IDataProvider.getBoolean] information will be stored in the [LayoutGraph]'s [map of data providers][yfiles.algorithms.Graph.getDataProvider]. Each corresponding element in the [ItemCollection] will be associated with a `true` value.
 * @param [itemCollection] The set of elements to add. If omitted, an instance will automatically be created and returned.
 * @return An [ItemCollection], if the `itemCollection` was specified as a parameter, it will be this instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GenericLayoutData%23GenericLayoutData-method-addEdgeItemCollection(string,ItemCollection)">Online Documentation</a>
 */
 final   fun addEdgeItemCollection( dpKey: String ,
 itemCollection: ItemCollection<IEdge>?  = definedExternally):ItemCollection<IEdge>
/**
 * Adds a set of [edges][IEdge] in the graph that will be passed to the [LayoutGraph]
 * @param [dpKey] The key under which the [Boolean][yfiles.algorithms.IDataProvider.getBoolean] information will be stored in the [LayoutGraph]'s [map of data providers][yfiles.algorithms.Graph.getDataProvider]. Each corresponding element in the [ItemCollection] will be associated with a `true` value.
 * @param [itemCollection] The set of elements to add. If omitted, an instance will automatically be created and returned.
 * @return An [ItemCollection], if the `itemCollection` was specified as a parameter, it will be this instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GenericLayoutData%23GenericLayoutData-method-addEdgeItemCollection(EdgeDpKey,ItemCollection)">Online Documentation</a>
 */
 final   fun addEdgeItemCollection( dpKey: EdgeDpKey<Boolean> ,
 itemCollection: ItemCollection<IEdge>?  = definedExternally):ItemCollection<IEdge>
/**
 * Adds data per [IEdge] in the graph that will be added to the [LayoutGraph]
 * @param [dpKey] The key under which the data will be registered in the [LayoutGraph]'s [map of data providers][yfiles.algorithms.Graph.getDataProvider]
 * @param [itemMapping] The mapping to add. If omitted, an instance will automatically be created and returned.
 * @return An [ItemMapping] for [IEdge]s, if the `itemMapping` was specified as a parameter, it will be this instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GenericLayoutData%23GenericLayoutData-method-addEdgeItemMapping(EdgeDpKey,ItemMapping)">Online Documentation</a>
 */
 final   fun <TValue : Any>addEdgeItemMapping( dpKey: EdgeDpKey<TValue> ,
 itemMapping: ItemMapping<IEdge, TValue>?  = definedExternally):ItemMapping<IEdge, TValue>
/**
 * Adds data per [edge][IEdge] in the graph that will be added to the [LayoutGraph]
 * @param [dpKey] The key under which the data will be registered in the [LayoutGraph]'s [map of data providers][yfiles.algorithms.Graph.getDataProvider]
 * @param [itemMapping] The mapping to add. If omitted, an instance will automatically be created and returned.
 * @return An [ItemMapping] for [IModelItem]s, if the `itemMapping` was specified as a parameter, it will be this instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GenericLayoutData%23GenericLayoutData-method-addEdgeItemMapping(string,ItemMapping)">Online Documentation</a>
 */
 final   fun <TValue>addEdgeItemMapping( dpKey: String ,
 itemMapping: ItemMapping<IEdge, TValue>?  = definedExternally):ItemMapping<IEdge, TValue>
/**
 * Adds a set of [ILabel]s in the graph that will be passed to the [LayoutGraph]
 * @param [dpKey] The `string` key under which the [Boolean][yfiles.algorithms.IDataProvider.getBoolean] information will be stored in the [LayoutGraph]'s [map of data providers][yfiles.algorithms.Graph.getDataProvider]. Each corresponding element in the [ItemCollection] will be associated with a `true` value.
 * @param [itemCollection] The set of elements to add. If omitted, an instance will automatically be created and returned.
 * @return An [ItemCollection], if the `itemCollection` was specified as a parameter, it will be this instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GenericLayoutData%23GenericLayoutData-method-addLabelItemCollection(string,ItemCollection)">Online Documentation</a>
 */
 final   fun addLabelItemCollection( dpKey: String ,
 itemCollection: ItemCollection<ILabel>?  = definedExternally):ItemCollection<ILabel>
/**
 * Adds a set of [ILabel]s in the graph that will be passed to the [LayoutGraph]
 * @param [dpKey] The key under which the [Boolean][yfiles.algorithms.IDataProvider.getBoolean] information will be stored in the [LayoutGraph]'s [map of data providers][yfiles.algorithms.Graph.getDataProvider]. Each corresponding element in the [ItemCollection] will be associated with a `true` value.
 * @param [itemCollection] The set of elements to add. If omitted, an instance will automatically be created and returned.
 * @return An [ItemCollection], if the `itemCollection` was specified as a parameter, it will be this instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GenericLayoutData%23GenericLayoutData-method-addLabelItemCollection(ILabelLayoutDpKey,ItemCollection)">Online Documentation</a>
 */
 final   fun addLabelItemCollection( dpKey: ILabelLayoutDpKey<Boolean> ,
 itemCollection: ItemCollection<ILabel>?  = definedExternally):ItemCollection<ILabel>
/**
 * Adds data per [ILabel] in the graph that will be added to the [LayoutGraph]
 * @param [dpKey] The key under which the data will be registered in the [LayoutGraph]'s [map of data providers][yfiles.algorithms.Graph.getDataProvider]
 * @param [itemMapping] The mapping to add. If omitted, an instance will automatically be created and returned.
 * @return An [ItemMapping] for [ILabel]s, if the `itemMapping` was specified as a parameter, it will be this instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GenericLayoutData%23GenericLayoutData-method-addLabelItemMapping(ILabelLayoutDpKey,ItemMapping)">Online Documentation</a>
 */
 final   fun <TValue : Any>addLabelItemMapping( dpKey: ILabelLayoutDpKey<TValue> ,
 itemMapping: ItemMapping<ILabel, TValue>?  = definedExternally):ItemMapping<ILabel, TValue>
/**
 * Adds data per [label][ILabel] in the graph that will be added to the [LayoutGraph]
 * @param [dpKey] The key under which the data will be registered in the [LayoutGraph]'s [map of data providers][yfiles.algorithms.Graph.getDataProvider]
 * @param [itemMapping] The mapping to add. If omitted, an instance will automatically be created and returned.
 * @return An [ItemMapping] for [IModelItem]s, if the `itemMapping` was specified as a parameter, it will be this instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GenericLayoutData%23GenericLayoutData-method-addLabelItemMapping(string,ItemMapping)">Online Documentation</a>
 */
 final   fun <TValue>addLabelItemMapping( dpKey: String ,
 itemMapping: ItemMapping<ILabel, TValue>?  = definedExternally):ItemMapping<ILabel, TValue>
/**
 * Adds a set of [IModelItem]s in the graph that will be passed to the [LayoutGraph]
 * @param [dpKey] The `string` key under which the [Boolean][yfiles.algorithms.IDataProvider.getBoolean] information will be stored in the [LayoutGraph]'s [map of data providers][yfiles.algorithms.Graph.getDataProvider]. Each corresponding element in the [ItemCollection] will be associated with a `true` value.
 * @param [itemCollection] The set of elements to add. If omitted, an instance will automatically be created and returned.
 * @return An [ItemCollection], if the `itemCollection` was specified as a parameter, it will be this instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GenericLayoutData%23GenericLayoutData-method-addNodeEdgeItemCollection(string,ItemCollection)">Online Documentation</a>
 */
 final   fun addNodeEdgeItemCollection( dpKey: String ,
 itemCollection: ItemCollection<IModelItem>?  = definedExternally):ItemCollection<IModelItem>
/**
 * Adds a set of [graph items][IModelItem] in the graph that will be passed to the [LayoutGraph]
 * @param [dpKey] The key under which the [Boolean][yfiles.algorithms.IDataProvider.getBoolean] information will be stored in the [LayoutGraph]'s [map of data providers][yfiles.algorithms.Graph.getDataProvider]. Each corresponding element in the [ItemCollection] will be associated with a `true` value.
 * @param [itemCollection] The set of elements to add. If omitted, an instance will automatically be created and returned.
 * @return An [ItemCollection], if the `itemCollection` was specified as a parameter, it will be this instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GenericLayoutData%23GenericLayoutData-method-addNodeEdgeItemCollection(GraphObjectDpKey,ItemCollection)">Online Documentation</a>
 */
 final   fun addNodeEdgeItemCollection( dpKey: GraphObjectDpKey<Boolean> ,
 itemCollection: ItemCollection<IModelItem>?  = definedExternally):ItemCollection<IModelItem>
/**
 * Adds data per [element][IModelItem] in the graph that will be added to the [LayoutGraph]
 * @param [dpKey] The key under which the data will be registered in the [LayoutGraph]'s [map of data providers][yfiles.algorithms.Graph.getDataProvider]
 * @param [itemMapping] The mapping to add. If omitted, an instance will automatically be created and returned.
 * @return An [ItemMapping] for [nodes and edges][IModelItem], if the `itemMapping` was specified as a parameter, it will be this instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GenericLayoutData%23GenericLayoutData-method-addNodeEdgeItemMapping(GraphObjectDpKey,ItemMapping)">Online Documentation</a>
 */
 final   fun <TValue : Any>addNodeEdgeItemMapping( dpKey: GraphObjectDpKey<TValue> ,
 itemMapping: ItemMapping<IModelItem, TValue>?  = definedExternally):ItemMapping<IModelItem, TValue>
/**
 * Adds data per [node or edge][IModelItem] in the graph that will be added to the [LayoutGraph]
 * @param [dpKey] The key under which the data will be registered in the [LayoutGraph]'s [map of data providers][yfiles.algorithms.Graph.getDataProvider]
 * @param [itemMapping] The mapping to add. If omitted, an instance will automatically be created and returned.
 * @return An [ItemMapping] for [IModelItem]s, if the `itemMapping` was specified as a parameter, it will be this instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GenericLayoutData%23GenericLayoutData-method-addNodeEdgeItemMapping(string,ItemMapping)">Online Documentation</a>
 */
 final   fun <TValue>addNodeEdgeItemMapping( dpKey: String ,
 itemMapping: ItemMapping<IModelItem, TValue>?  = definedExternally):ItemMapping<IModelItem, TValue>
/**
 * Adds a set of [INode]s in the graph that will be passed to the [LayoutGraph]
 * @param [dpKey] The `string` key under which the [Boolean][yfiles.algorithms.IDataProvider.getBoolean] information will be stored in the [LayoutGraph]'s [map of data providers][yfiles.algorithms.Graph.getDataProvider]. Each corresponding element in the [ItemCollection] will be associated with a `true` value.
 * @param [itemCollection] The set of elements to add. If omitted, an instance will automatically be created and returned.
 * @return An [ItemCollection], if the `itemCollection` was specified as a parameter, it will be this instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GenericLayoutData%23GenericLayoutData-method-addNodeItemCollection(string,ItemCollection)">Online Documentation</a>
 */
 final   fun addNodeItemCollection( dpKey: String ,
 itemCollection: ItemCollection<INode>?  = definedExternally):ItemCollection<INode>
/**
 * Adds a set of [INode]s in the graph that will be passed to the [LayoutGraph]
 * @param [dpKey] The key under which the [Boolean][yfiles.algorithms.IDataProvider.getBoolean] information will be stored in the [LayoutGraph]'s [map of data providers][yfiles.algorithms.Graph.getDataProvider]. Each corresponding element in the [ItemCollection] will be associated with a `true` value.
 * @param [itemCollection] The set of elements to add. If omitted, an instance will automatically be created and returned.
 * @return An [ItemCollection], if the `itemCollection` was specified as a parameter, it will be this instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GenericLayoutData%23GenericLayoutData-method-addNodeItemCollection(NodeDpKey,ItemCollection)">Online Documentation</a>
 */
 final   fun addNodeItemCollection( dpKey: NodeDpKey<Boolean> ,
 itemCollection: ItemCollection<INode>?  = definedExternally):ItemCollection<INode>
/**
 * Adds data per [INode] in the graph that will be added to the [LayoutGraph]
 * @param [dpKey] The key under which the data will be registered in the [LayoutGraph]'s [map of data providers][yfiles.algorithms.Graph.getDataProvider]
 * @param [itemMapping] The mapping to add. If omitted, an instance will automatically be created and returned.
 * @return An [ItemMapping] for [INode]s, if the `itemMapping` was specified as a parameter, it will be this instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GenericLayoutData%23GenericLayoutData-method-addNodeItemMapping(NodeDpKey,ItemMapping)">Online Documentation</a>
 */
 final   fun <TValue : Any>addNodeItemMapping( dpKey: NodeDpKey<TValue> ,
 itemMapping: ItemMapping<INode, TValue>?  = definedExternally):ItemMapping<INode, TValue>
/**
 * Adds data per [node][INode] in the graph that will be added to the [LayoutGraph]
 * @param [dpKey] The key under which the data will be registered in the [LayoutGraph]'s [map of data providers][yfiles.algorithms.Graph.getDataProvider]
 * @param [itemMapping] The mapping to add. If omitted, an instance will automatically be created and returned.
 * @return An [ItemMapping] for [IModelItem]s, if the `itemMapping` was specified as a parameter, it will be this instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GenericLayoutData%23GenericLayoutData-method-addNodeItemMapping(string,ItemMapping)">Online Documentation</a>
 */
 final   fun <TValue>addNodeItemMapping( dpKey: String ,
 itemMapping: ItemMapping<INode, TValue>?  = definedExternally):ItemMapping<INode, TValue>

companion object : ClassMetadata<GenericLayoutData> {
}
}

inline fun GenericLayoutData(
    block: GenericLayoutData.() -> Unit
): GenericLayoutData {
    return GenericLayoutData()
        .apply(block)
}
