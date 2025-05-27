// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import yfiles.collections.ItemCollection
import yfiles.collections.ItemMapping
import yfiles.lang.ClassMetadata

/**
 * This class provides a way to easily pass custom item-specific data to the [LayoutGraph] which is used during the layout algorithm execution.
 * @see [LayoutData]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GenericLayoutData">Online Documentation</a>
 * 
 * @constructor
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GenericLayoutData%23GenericLayoutData-constructor-GenericLayoutData">Online Documentation</a>
 */
external class GenericLayoutData<TNode, TEdge, TNodeLabel, TEdgeLabel> () : LayoutData<TNode, TEdge, TNodeLabel, TEdgeLabel> {
  /**
   * Adds the data from one or more other [LayoutData] instances to this instance.
   * @param [data] The data to add to this instance.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GenericLayoutData%23GenericLayoutData-method-add">Online Documentation</a>
   */
  fun add(
    vararg data: LayoutData<TNode, TEdge, TNodeLabel, TEdgeLabel>,
  )
  
  /**
   * Adds a set of `TNode`s in the graph that will be passed to the [LayoutGraph].
   * @param [dataKey] The key under which the [Boolean][yfiles.collections.IMapper] information will be stored in the [LayoutGraph]'s [map of data providers][LayoutGraphContext]. Each corresponding element in the [ItemCollection] will be associated with a `true` value.
   * @param [initialCollection] The set of [TNode] elements to add.
   * @return An [ItemCollection].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GenericLayoutData%23GenericLayoutData-method-addItemCollection(NodeDataKey,ItemCollection)">Online Documentation</a>
   */
  fun addItemCollection(
    dataKey: NodeDataKey<Boolean>,
    initialCollection: ItemCollection<TNode>  = definedExternally,
  ): ItemCollection<TNode>
  
  /**
   * Adds a set of node labels in the graph that will be passed to the [LayoutGraph].
   * @param [dataKey] The key under which the [Boolean][yfiles.collections.IMapper] information will be stored in the [LayoutGraph]'s [map of data providers][LayoutGraphContext]. Each corresponding element in the [ItemCollection] will be associated with a `true` value.
   * @param [initialCollection] The set of node labels elements to add.
   * @return An [ItemCollection].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GenericLayoutData%23GenericLayoutData-method-addItemCollection(NodeLabelDataKey,ItemCollection)">Online Documentation</a>
   */
  fun addItemCollection(
    dataKey: NodeLabelDataKey<Boolean>,
    initialCollection: ItemCollection<TNodeLabel>  = definedExternally,
  ): ItemCollection<TNodeLabel>
  
  /**
   * Adds a set of edge labels in the graph that will be passed to the [LayoutGraph].
   * @param [dataKey] The key under which the [Boolean][yfiles.collections.IMapper] information will be stored in the [LayoutGraph]'s [map of data providers][LayoutGraphContext]. Each corresponding element in the [ItemCollection] will be associated with a `true` value.
   * @param [initialCollection] The set of edge labels elements to add.
   * @return An [ItemCollection].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GenericLayoutData%23GenericLayoutData-method-addItemCollection(EdgeLabelDataKey,ItemCollection)">Online Documentation</a>
   */
  fun addItemCollection(
    dataKey: EdgeLabelDataKey<Boolean>,
    initialCollection: ItemCollection<TEdgeLabel>  = definedExternally,
  ): ItemCollection<TEdgeLabel>
  
  /**
   * Adds a set of `TEdge` in the graph that will be passed to the [LayoutGraph].
   * @param [dataKey] The key under which the [Boolean][yfiles.collections.IMapper] information will be stored in the [LayoutGraph]'s [map of data providers][LayoutGraphContext]. Each corresponding element in the [ItemCollection] will be associated with a `true` value.
   * @param [initialCollection] The set of elements to add. If omitted, an instance will automatically be created and returned.
   * @return An [ItemCollection].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GenericLayoutData%23GenericLayoutData-method-addItemCollection(EdgeDataKey,ItemCollection)">Online Documentation</a>
   */
  fun addItemCollection(
    dataKey: EdgeDataKey<Boolean>,
    initialCollection: ItemCollection<TEdge>  = definedExternally,
  ): ItemCollection<TEdge>
  
  /**
   * Adds data per `TNode` in the graph that will be added to the [LayoutGraph].
   * @param [dataKey] The key under which the data will be registered in the [LayoutGraph]'s [map of data providers][LayoutGraphContext].
   * @param [initialMapping] The mapping to add.
   * @return An [ItemMapping] for `TNode`s.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GenericLayoutData%23GenericLayoutData-method-addItemMapping(NodeDataKey,ItemMapping)">Online Documentation</a>
   */
  fun <TValue> addItemMapping(
    dataKey: NodeDataKey<TValue>,
    initialMapping: ItemMapping<TNode, TValue>  = definedExternally,
  ): ItemMapping<TNode, TValue>
  
  /**
   * Adds data per `TEdge` in the graph that will be added to the [LayoutGraph].
   * @param [dataKey] The key under which the data will be registered in the [LayoutGraph]'s [map of data providers][LayoutGraphContext].
   * @param [itemMapping] The mapping to add.
   * @return An [ItemMapping] for `TEdge`s.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GenericLayoutData%23GenericLayoutData-method-addItemMapping(EdgeDataKey,ItemMapping)">Online Documentation</a>
   */
  fun <TValue> addItemMapping(
    dataKey: EdgeDataKey<TValue>,
    itemMapping: ItemMapping<TEdge, TValue>  = definedExternally,
  ): ItemMapping<TEdge, TValue>
  
  /**
   * Adds data per node labels in the graph that will be added to the [LayoutGraph].
   * @param [dataKey] The key under which the data will be registered in the [LayoutGraph]'s [map of data providers][LayoutGraphContext]
   * @param [itemMapping] The mapping to add.
   * @return An [ItemMapping] for labels at nodes.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GenericLayoutData%23GenericLayoutData-method-addItemMapping(NodeLabelDataKey,ItemMapping)">Online Documentation</a>
   */
  fun <TValue> addItemMapping(
    dataKey: NodeLabelDataKey<TValue>,
    itemMapping: ItemMapping<TNodeLabel, TValue>  = definedExternally,
  ): ItemMapping<TNodeLabel, TValue>
  
  /**
   * Adds data per edge label in the graph that will be added to the [LayoutGraph].
   * @param [dataKey] The key under which the data will be registered in the [LayoutGraph]'s [map of data providers][LayoutGraphContext]
   * @param [itemMapping] The mapping to add.
   * @return An [ItemMapping] for labels at edges.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GenericLayoutData%23GenericLayoutData-method-addItemMapping(EdgeLabelDataKey,ItemMapping)">Online Documentation</a>
   */
  fun <TValue> addItemMapping(
    dataKey: EdgeLabelDataKey<TValue>,
    itemMapping: ItemMapping<TEdgeLabel, TValue>  = definedExternally,
  ): ItemMapping<TEdgeLabel, TValue>
  
  companion object : ClassMetadata<GenericLayoutData<*, *, *, *>> {
  }
}
