// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.binding

import yfiles.collections.IEnumerable
import yfiles.geometry.Point
import yfiles.graph.IEdge
import yfiles.graph.IEdgeDefaults
import yfiles.graph.IGraph
import yfiles.graph.INode
import yfiles.graph.Tag
import yfiles.lang.ClassMetadata
import yfiles.lang.EventHandler1
import yfiles.lang.IEventDispatcher
import yfiles.styles.IEdgeStyle

/**
 * This class can be used to create and update [IEdge]s based on data items.
 * @param [TDataItem] The type of the data items in the source.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeCreator">Online Documentation</a>
 * 
 * @constructor Creates a new creator for edges.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeCreator%23EdgeCreator-constructor-EdgeCreator">Online Documentation</a>
 */
open external class EdgeCreator<TDataItem> () : IEventDispatcher {
  /**
   * Gets or sets an optional provider of an object that will be used as the edge's [bends][IEdge] locations for the source data item.
   * @see [getBends]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeCreator%23bendsProvider">Online Documentation</a>
   */
  final var bendsProvider: Provider<TDataItem, IEnumerable<Point>>?
  
  /**
   * Gets or sets a set of [IEdgeDefaults] that will be used for the edges and edge labels.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeCreator%23defaults">Online Documentation</a>
   */
  final var defaults: IEdgeDefaults
  
  /**
   * Gets or sets an optional set of bindings that will be [applied][EdgeCreator] to the edge's [style][IEdge].
   * @see [applyStyleBindings]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeCreator%23styleBindings">Online Documentation</a>
   */
  final var styleBindings: ObjectBindings<TDataItem>
  
  /**
   * Gets or sets an optional provider of an [IEdgeStyle] instance that will be used as the edge's [style][IEdge] for the source data item.
   * 
   * By default the [defaults][EdgeCreator]' [style][IEdgeDefaults] will be used. Note that [shareStyleInstance][IEdgeDefaults] will be ignored if this provider returns a value. Use the [styleBindings][EdgeCreator] to reconfigure properties of the style instances.
   * @see [getStyle]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeCreator%23styleProvider">Online Documentation</a>
   */
  final var styleProvider: Provider<TDataItem, IEdgeStyle>?
  
  /**
   * Gets or sets an optional provider of an object that will be used as the edge's [tag][yfiles.collections.ITagOwner] for the source data item.
   * @see [getTag]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeCreator%23tagProvider">Online Documentation</a>
   */
  final var tagProvider: Provider<TDataItem, Any>?
  
  /**
   * Adds the given `labelsSource` to this instance.
   * @param [TLabelDataItem] The type of the data items in the source.
   * @param [dataProvider] A function that provides the label data items from the data item.
   * @param [labelsSource] The source to which the data is added.
   * @see [createLabelsSource]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeCreator%23EdgeCreator-method-addLabelsSource">Online Documentation</a>
   */
  fun <TLabelDataItem> addLabelsSource(
    dataProvider: Provider<TDataItem, Any>,
    labelsSource: LabelsSource<TLabelDataItem>,
  )
  
  /**
   * Resolves the [styleBindings][EdgeCreator] against the given `dataItem` and applies them to the given `edge` style.
   * @param [graph] The managed graph.
   * @param [edge] The edge to update.
   * @param [dataItem] The data item that is used.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeCreator%23EdgeCreator-method-applyStyleBindings">Online Documentation</a>
   */
  fun applyStyleBindings(
    graph: IGraph,
    edge: IEdge,
    dataItem: TDataItem,
  )
  
  /**
   * Creates an edge in the graph with the values of the bindings resolved against the `dataItem`.
   * @param [graph] The graph to create the edge in.
   * @param [source] The source node.
   * @param [target] The target node.
   * @param [dataItem] The data item from which the edge is created.
   * @return The newly created edge.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeCreator%23EdgeCreator-method-createEdge">Online Documentation</a>
   */
  open fun createEdge(
    graph: IGraph,
    source: INode,
    target: INode,
    dataItem: TDataItem,
  ): IEdge
  
  /**
   * Called from [createEdge][EdgeCreator] and performs the actual edge creation in the graph.
   * @param [graph] The graph to create the edge in.
   * @param [source] The source node.
   * @param [target] The target node.
   * @param [style] The style of the edge.
   * @param [tag] The tag of the edge.
   * @return The newly created edge.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeCreator%23EdgeCreator-method-createEdgeCore">Online Documentation</a>
   */
  protected open fun createEdgeCore(
    graph: IGraph,
    source: INode,
    target: INode,
    style: IEdgeStyle,
    tag: Tag?,
  ): IEdge
  
  /**
   * Creates a binding for labels that will be added to edges created by this instance.
   * @param [text] An optional provider for the [text][yfiles.graph.ILabel] property. If the provider returns `null` or `undefined` no label will be created. To force creation of an empty label the provider must return an empty string instead.
   * @return A new [LabelCreator] instance that can be further configured.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeCreator%23EdgeCreator-method-createLabelBinding">Online Documentation</a>
   */
  fun createLabelBinding(
    text: Provider<TDataItem, String>  = definedExternally,
  ): LabelCreator<TDataItem>
  
  /**
   * Creates a new source of label data items that will be added to edges created by this instance.
   * @param [TLabelDataItem] The type of the data items in the source.
   * @param [data] A function that provides a collection of label data items from the edge data item.
   * @param [id] An optional function that yields an id for each label data item that is provided from the label data provider. This id is used to identify the labels during [updateLabels][EdgeCreator].
   * @return A new [LabelsSource] instance whose [LabelCreator] can be configured further.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeCreator%23EdgeCreator-method-createLabelsSource">Online Documentation</a>
   */
  fun <TLabelDataItem> createLabelsSource(
    data: Provider<TDataItem, Any>,
    id: IdProvider<TLabelDataItem>  = definedExternally,
  ): LabelsSource<TLabelDataItem>
  
  /**
   * Obtains an [Point] array by resolving the [bendsProvider][EdgeCreator].
   * @param [dataItem] The data item on which the provider is resolved.
   * @return The value to use or `null` in case no bend locations are given.
   * @see [bendsProvider]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeCreator%23EdgeCreator-method-getBends">Online Documentation</a>
   */
  protected open fun getBends(
    dataItem: TDataItem,
  ): IEnumerable<Point>?
  
  /**
   * Obtains an [IEdgeStyle] instance or `null` by resolving the [styleProvider][EdgeCreator].
   * @param [dataItem] The data item on which the provider is resolved.
   * @return The value to use or `null` in case the defaults should be used.
   * @see [styleProvider]
   * @see [styleBindings]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeCreator%23EdgeCreator-method-getStyle">Online Documentation</a>
   */
  protected open fun getStyle(
    dataItem: TDataItem,
  ): IEdgeStyle?
  
  /**
   * Obtains an `object` to use as [tag][yfiles.collections.ITagOwner] by resolving the [tagProvider][EdgeCreator] on the data item.
   * @param [dataItem] The data item on which the provider is resolved.
   * @return The value to use or `null` in case the defaults should be used.
   * @see [tagProvider]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeCreator%23EdgeCreator-method-getTag">Online Documentation</a>
   */
  protected open fun getTag(
    dataItem: TDataItem,
  ): Any?
  
  /**
   * Resolves the [bendsProvider][EdgeCreator] on the given data item.
   * @param [graph] The managed graph.
   * @param [edge] The edge for which the new tag should be obtained.
   * @param [dataItem] The data item that is used.
   * @return Returns the updated bends object.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeCreator%23EdgeCreator-method-getUpdatedBends">Online Documentation</a>
   */
  protected open fun getUpdatedBends(
    graph: IGraph,
    edge: IEdge,
    dataItem: TDataItem,
  ): IEnumerable<Point>?
  
  /**
   * Resolves the [styleProvider][EdgeCreator] and then [applies the style bindings][EdgeCreator].
   * @param [graph] The managed graph.
   * @param [edge] The edge to update.
   * @param [dataItem] The data item that is used.
   * @return The updated style instance. Either the value returned by [getStyle][EdgeCreator], or the [default style][EdgeCreator], if [getStyle][EdgeCreator] returns `null`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeCreator%23EdgeCreator-method-getUpdatedStyle">Online Documentation</a>
   */
  protected open fun getUpdatedStyle(
    graph: IGraph,
    edge: IEdge,
    dataItem: TDataItem,
  ): IEdgeStyle
  
  /**
   * Resolves the [tagProvider][EdgeCreator] on the given data item.
   * @param [graph] The managed graph.
   * @param [edge] The edge for which the new tag should be obtained.
   * @param [dataItem] The data item that is used.
   * @return Returns the updated tag object.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeCreator%23EdgeCreator-method-getUpdatedTag">Online Documentation</a>
   */
  protected open fun getUpdatedTag(
    graph: IGraph,
    edge: IEdge,
    dataItem: TDataItem,
  ): Any?
  
  /**
   * Triggers the [edge-created][EdgeCreator] event.
   * @param [graph] The graph in which the edge has been created.
   * @param [edge] The edge that has been created.
   * @param [dataItem] The data item from which the edge has been created.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeCreator%23EdgeCreator-method-onEdgeCreated">Online Documentation</a>
   */
  protected open fun onEdgeCreated(
    graph: IGraph,
    edge: IEdge,
    dataItem: TDataItem,
  )
  
  /**
   * Triggers the [edge-updated][EdgeCreator] event.
   * @param [graph] The graph in which the edge has been updated.
   * @param [edge] The edge that has been updated.
   * @param [dataItem] The data item with which the edge has been updated.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeCreator%23EdgeCreator-method-onEdgeUpdated">Online Documentation</a>
   */
  protected open fun onEdgeUpdated(
    graph: IGraph,
    edge: IEdge,
    dataItem: TDataItem,
  )
  
  /**
   * Updates the bends of the `edge` with the given `dataItem` by calling [getUpdatedBends][EdgeCreator] and updating the bends on the edge in the graph.
   * @param [graph] The managed graph.
   * @param [edge] The edge to update.
   * @param [dataItem] The data item that is used for the update.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeCreator%23EdgeCreator-method-updateBends">Online Documentation</a>
   */
  fun updateBends(
    graph: IGraph,
    edge: IEdge,
    dataItem: TDataItem,
  )
  
  /**
   * Updates the edge.
   * @param [graph] The graph that contains the edge.
   * @param [edge] The edge to update.
   * @param [dataItem] The data item with which the edge should be updated.
   * @see [updateBends]
   * @see [updateStyle]
   * @see [updateLabels]
   * @see [updateTag]
   * @see [applyStyleBindings]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeCreator%23EdgeCreator-method-updateEdge">Online Documentation</a>
   */
  open fun updateEdge(
    graph: IGraph,
    edge: IEdge,
    dataItem: TDataItem,
  )
  
  /**
   * Can be used to update the labels of the edge that have been added with this [EdgeCreator].
   * @param [graph] The managed graph.
   * @param [edge] The edge whose labels to update.
   * @param [dataItem] The edge data item with which the edge's labels should be updated.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeCreator%23EdgeCreator-method-updateLabels">Online Documentation</a>
   */
  open fun updateLabels(
    graph: IGraph,
    edge: IEdge,
    dataItem: TDataItem,
  )
  
  /**
   * Updates the style of the `edge` with the given `dataItem` by calling [getUpdatedStyle][EdgeCreator] and applying the style to the edge in the graph.
   * @param [graph] The managed graph.
   * @param [edge] The edge to update.
   * @param [dataItem] The data item that is used for the update.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeCreator%23EdgeCreator-method-updateStyle">Online Documentation</a>
   */
  fun updateStyle(
    graph: IGraph,
    edge: IEdge,
    dataItem: TDataItem,
  )
  
  /**
   * Updates the [tag][yfiles.collections.ITagOwner] of the `edge` with the given `dataItem` by calling [getUpdatedTag][EdgeCreator] and setting the new `tag` on the edge.
   * @param [graph] The managed graph.
   * @param [edge] The edge to update.
   * @param [dataItem] The data item that is used for the update.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeCreator%23EdgeCreator-method-updateTag">Online Documentation</a>
   */
  fun updateTag(
    graph: IGraph,
    edge: IEdge,
    dataItem: TDataItem,
  )
  
  companion object : ClassMetadata<EdgeCreator<*>> {
  }
}

/**
 * `edge-created`: Occurs when a edge has been created.
 * @see [addEdgeUpdatedHandler]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeCreator%23edge-created">Online Documentation</a>
 */
inline fun <TDataItem> EdgeCreator<TDataItem>.addEdgeCreatedHandler(
  crossinline handler: (event:GraphBuilderItemEventArgs<IEdge, TDataItem>) -> Unit
): () -> Unit {
  val listener: EventHandler1<GraphBuilderItemEventArgs<IEdge, TDataItem>> = { event, _ -> handler(event) }
  addEventListener("edge-created", listener)
  return { removeEventListener("edge-created", listener) }
}

/**
 * `edge-updated`: Occurs when a edge has been updated.
 * @see [addEdgeCreatedHandler]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeCreator%23edge-updated">Online Documentation</a>
 */
inline fun <TDataItem> EdgeCreator<TDataItem>.addEdgeUpdatedHandler(
  crossinline handler: (event:GraphBuilderItemEventArgs<IEdge, TDataItem>) -> Unit
): () -> Unit {
  val listener: EventHandler1<GraphBuilderItemEventArgs<IEdge, TDataItem>> = { event, _ -> handler(event) }
  addEventListener("edge-updated", listener)
  return { removeEventListener("edge-updated", listener) }
}
