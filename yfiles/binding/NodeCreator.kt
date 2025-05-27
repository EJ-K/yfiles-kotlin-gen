// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.binding

import yfiles.geometry.Rect
import yfiles.graph.IGraph
import yfiles.graph.INode
import yfiles.graph.INodeDefaults
import yfiles.graph.Tag
import yfiles.lang.ClassMetadata
import yfiles.lang.EventHandler1
import yfiles.lang.IEventDispatcher
import yfiles.lang.Predicate
import yfiles.styles.INodeStyle

/**
 * This class can be used to create and update [INode]s based on data items.
 * @param [TDataItem] The type of the data items in the source.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeCreator">Online Documentation</a>
 * 
 * @constructor Creates a new creator for nodes or [group nodes][IGraph].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeCreator%23NodeCreator-constructor-NodeCreator">Online Documentation</a>
 */
open external class NodeCreator<TDataItem> () : IEventDispatcher {
  /**
   * Gets or sets a set of [INodeDefaults] that will be used for the nodes and node labels.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeCreator%23defaults">Online Documentation</a>
   */
  final var defaults: INodeDefaults
  
  /**
   * Gets or sets a predicate that determines whether the node created for a data item shall be a [group node][IGraph] or not.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeCreator%23isGroupPredicate">Online Documentation</a>
   */
  final var isGroupPredicate: Predicate<TDataItem>
  
  /**
   * Gets or sets an optional set of bindings that will be [applied][NodeCreator] to the node's [layout][INode].
   * @see [applyLayoutBindings]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeCreator%23layoutBindings">Online Documentation</a>
   */
  final var layoutBindings: ObjectBindings<TDataItem>
  
  /**
   * Gets or sets an optional provider of a [Rect] that will be used as the node's [layout][INode] for the source data item.
   * @see [getLayout]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeCreator%23layoutProvider">Online Documentation</a>
   */
  final var layoutProvider: Provider<TDataItem, Rect>?
  
  /**
   * Gets or sets an optional set of bindings that will be [applied][NodeCreator] to the node's [style][INode].
   * @see [applyStyleBindings]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeCreator%23styleBindings">Online Documentation</a>
   */
  final var styleBindings: ObjectBindings<TDataItem>
  
  /**
   * Gets or sets an optional provider of an [INodeStyle] instance that will be used as the node's [style][INode] for the source data item.
   * 
   * By default the [defaults][NodeCreator]' [style][INodeDefaults] will be used. Note that [shareStyleInstance][INodeDefaults] will be ignored if this provider returns a value. Use the [styleBindings][NodeCreator] to reconfigure properties of the style instances.
   * @see [getStyle]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeCreator%23styleProvider">Online Documentation</a>
   */
  final var styleProvider: Provider<TDataItem, INodeStyle>?
  
  /**
   * Gets or sets an optional provider of an object that will be used as the node's [tag][yfiles.collections.ITagOwner] for the source data item.
   * 
   * By default the source data item itself will be used as the tag.
   * @see [getTag]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeCreator%23tagProvider">Online Documentation</a>
   */
  final var tagProvider: Provider<TDataItem, Any>?
  
  /**
   * Adds the given `labelsSource` to this instance.
   * @param [TLabelDataItem] The type of the data items in the source.
   * @param [dataProvider] A function that provides the label data items from the data item.
   * @param [labelsSource] The source to which the data is added.
   * @see [createLabelsSource]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeCreator%23NodeCreator-method-addLabelsSource">Online Documentation</a>
   */
  fun <TLabelDataItem> addLabelsSource(
    dataProvider: Provider<TDataItem, Any>,
    labelsSource: LabelsSource<TLabelDataItem>,
  )
  
  /**
   * Resolves the [layoutBindings][NodeCreator] against the given `dataItem` and applies them on the given `node` layout.
   * @param [graph] The managed graph.
   * @param [node] The node to update.
   * @param [dataItem] The data item that is used.
   * @see [updateLayout]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeCreator%23NodeCreator-method-applyLayoutBindings">Online Documentation</a>
   */
  fun applyLayoutBindings(
    graph: IGraph,
    node: INode,
    dataItem: TDataItem,
  )
  
  /**
   * Resolves the [styleBindings][NodeCreator] against the given `dataItem` and applies them to the `node` style.
   * @param [graph] The managed graph.
   * @param [node] The node to update.
   * @param [dataItem] The data item that is used.
   * @see [updateStyle]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeCreator%23NodeCreator-method-applyStyleBindings">Online Documentation</a>
   */
  fun applyStyleBindings(
    graph: IGraph,
    node: INode,
    dataItem: TDataItem,
  )
  
  /**
   * Creates a binding for labels that will be added to nodes created by this instance.
   * @param [text] An optional provider for the [text][yfiles.graph.ILabel] property. If the provider returns `null` or `undefined` no label will be created. To force creation of an empty label the provider must return an empty string instead.
   * @return A new [LabelCreator] instance that can be further configured.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeCreator%23NodeCreator-method-createLabelBinding">Online Documentation</a>
   */
  fun createLabelBinding(
    text: Provider<TDataItem, String>  = definedExternally,
  ): LabelCreator<TDataItem>
  
  /**
   * Creates a new source of label data items that will be added to nodes created by this instance.
   * @param [TLabelDataItem] The type of the data items in the source.
   * @param [data] A function that provides a collection of label data items from the node data item.
   * @param [id] An optional function that yields an id for each label data item that is provided from the label data provider. This id is used to identify the labels during [updateLabels][NodeCreator].
   * @return A new [LabelsSource] instance whose [LabelCreator] can be configured further.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeCreator%23NodeCreator-method-createLabelsSource">Online Documentation</a>
   */
  fun <TLabelDataItem> createLabelsSource(
    data: Provider<TDataItem, Any>,
    id: IdProvider<TLabelDataItem>  = definedExternally,
  ): LabelsSource<TLabelDataItem>
  
  /**
   * Creates a node in the graph with the values of the bindings resolved against the `dataItem`.
   * @param [graph] The graph to create the node in.
   * @param [parent] The parent node for the newly created node.
   * @param [dataItem] The data item for which to create the node.
   * @return The newly created node.
   * @see [isGroupPredicate]
   * @see [getLayout]
   * @see [getStyle]
   * @see [getTag]
   * @see [applyLayoutBindings]
   * @see [applyStyleBindings]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeCreator%23NodeCreator-method-createNode">Online Documentation</a>
   */
  open fun createNode(
    graph: IGraph,
    parent: INode?,
    dataItem: TDataItem,
  ): INode
  
  /**
   * Called from [createNode][NodeCreator] and performs the actual node creation in the graph.
   * @param [graph] The graph to create the node in.
   * @param [groupNode] Whether to create a group node.
   * @param [parent] Optional parent of the node.
   * @param [layout] The layout of the node.
   * @param [style] The style of the node.
   * @param [tag] The tag of the node.
   * @return The newly created node.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeCreator%23NodeCreator-method-createNodeCore">Online Documentation</a>
   */
  protected open fun createNodeCore(
    graph: IGraph,
    groupNode: Boolean,
    parent: INode?,
    layout: Rect,
    style: INodeStyle,
    tag: Tag?,
  ): INode
  
  /**
   * Obtains a [Rect] to use as [layout][INode] or `null` by resolving the [layoutProvider][NodeCreator] and afterwards applying the [layoutBindings][NodeCreator].
   * @param [dataItem] The data item on which the provider is resolved.
   * @return The value to use or `null` in case the defaults should be used.
   * @see [layoutProvider]
   * @see [layoutBindings]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeCreator%23NodeCreator-method-getLayout">Online Documentation</a>
   */
  protected open fun getLayout(
    dataItem: TDataItem,
  ): Rect?
  
  /**
   * Obtains an [INodeStyle] instance or `null` by resolving the [styleProvider][NodeCreator].
   * @param [dataItem] The data item on which the provider is resolved.
   * @return The value to use or `null` in case the defaults should be used.
   * @see [styleProvider]
   * @see [styleBindings]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeCreator%23NodeCreator-method-getStyle">Online Documentation</a>
   */
  protected open fun getStyle(
    dataItem: TDataItem,
  ): INodeStyle?
  
  /**
   * Obtains an `object` to use as [tag][yfiles.collections.ITagOwner] by resolving the [tagProvider][NodeCreator] on the data item.
   * @param [dataItem] The data item on which the provider is resolved.
   * @return The value to use or `null` in case the defaults should be used.
   * @see [tagProvider]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeCreator%23NodeCreator-method-getTag">Online Documentation</a>
   */
  protected open fun getTag(
    dataItem: TDataItem,
  ): Any?
  
  /**
   * Resolves the [layoutProvider][NodeCreator] and then [applies the layout bindings][NodeCreator].
   * @param [graph] The managed graph.
   * @param [node] The node to update.
   * @param [dataItem] The data item that is used.
   * @return An updated [Rect] based on the given data item.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeCreator%23NodeCreator-method-getUpdatedLayout">Online Documentation</a>
   */
  protected open fun getUpdatedLayout(
    graph: IGraph,
    node: INode,
    dataItem: TDataItem,
  ): Rect
  
  /**
   * Resolves the [styleProvider][NodeCreator] and then [applies the style bindings][NodeCreator].
   * @param [graph] The managed graph.
   * @param [node] The node to update.
   * @param [dataItem] The data item that is used.
   * @return The updated style instance. Either the value returned by [getStyle][NodeCreator], or the [default style][NodeCreator], if [getStyle][NodeCreator] returns `null`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeCreator%23NodeCreator-method-getUpdatedStyle">Online Documentation</a>
   */
  protected open fun getUpdatedStyle(
    graph: IGraph,
    node: INode,
    dataItem: TDataItem,
  ): INodeStyle
  
  /**
   * Resolves the [tagProvider][NodeCreator] on the given data item.
   * @param [graph] The managed graph.
   * @param [node] The node for which the new tag should be obtained.
   * @param [dataItem] The data item that is used.
   * @return Returns the updated tag object.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeCreator%23NodeCreator-method-getUpdatedTag">Online Documentation</a>
   */
  protected open fun getUpdatedTag(
    graph: IGraph,
    node: INode,
    dataItem: TDataItem,
  ): Any?
  
  /**
   * Triggers the [node-created][NodeCreator] event.
   * @param [graph] The graph in which the node has been created.
   * @param [node] The node that has been created.
   * @param [dataItem] The data item from which the node has been created.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeCreator%23NodeCreator-method-onNodeCreated">Online Documentation</a>
   */
  protected open fun onNodeCreated(
    graph: IGraph,
    node: INode,
    dataItem: TDataItem,
  )
  
  /**
   * Triggers the [node-updated][NodeCreator] event.
   * @param [graph] The graph in which the node has been updated.
   * @param [node] The node that has been updated.
   * @param [dataItem] The data item with which the node has been updated.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeCreator%23NodeCreator-method-onNodeUpdated">Online Documentation</a>
   */
  protected open fun onNodeUpdated(
    graph: IGraph,
    node: INode,
    dataItem: TDataItem,
  )
  
  /**
   * Can be used to update the labels of the node that have been added with this [NodeCreator].
   * @param [graph] The managed graph.
   * @param [node] The node whose labels to update.
   * @param [dataItem] The node data item with which the node's labels should be updated.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeCreator%23NodeCreator-method-updateLabels">Online Documentation</a>
   */
  open fun updateLabels(
    graph: IGraph,
    node: INode,
    dataItem: TDataItem,
  )
  
  /**
   * Updates the layout of the `node` in the graph with the given layout information of the given `dataItem` by calling [getUpdatedLayout][NodeCreator] and applying it to the node.
   * @param [graph] The managed graph.
   * @param [node] The node to update.
   * @param [dataItem] The data item that is used for the update.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeCreator%23NodeCreator-method-updateLayout">Online Documentation</a>
   */
  fun updateLayout(
    graph: IGraph,
    node: INode,
    dataItem: TDataItem,
  )
  
  /**
   * Updates the node.
   * @param [graph] The graph that contains the node.
   * @param [node] The node to update.
   * @param [parent] The new parent of the node.
   * @param [dataItem] The data item with which the node should be updated.
   * @see [updateLayout]
   * @see [updateStyle]
   * @see [updateTag]
   * @see [updateLabels]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeCreator%23NodeCreator-method-updateNode">Online Documentation</a>
   */
  open fun updateNode(
    graph: IGraph,
    node: INode,
    parent: INode?,
    dataItem: TDataItem,
  )
  
  /**
   * Updates the style of the `node` with the given `dataItem` by calling [getUpdatedStyle][NodeCreator] and applying the style to the node in the graph.
   * @param [graph] The managed graph.
   * @param [node] The node to update.
   * @param [dataItem] The data item that is used for the update.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeCreator%23NodeCreator-method-updateStyle">Online Documentation</a>
   */
  fun updateStyle(
    graph: IGraph,
    node: INode,
    dataItem: TDataItem,
  )
  
  /**
   * Updates the [tag][yfiles.collections.ITagOwner] of the `node` with the given `dataItem` by calling [getUpdatedTag][NodeCreator] and setting the new `tag` on the node.
   * @param [graph] The managed graph.
   * @param [node] The node to update.
   * @param [dataItem] The data item that is used for the update.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeCreator%23NodeCreator-method-updateTag">Online Documentation</a>
   */
  fun updateTag(
    graph: IGraph,
    node: INode,
    dataItem: TDataItem,
  )
  
  companion object : ClassMetadata<NodeCreator<*>> {
  }
}

/**
 * `node-created`: Occurs when a node has been created.
 * @see [addNodeUpdatedHandler]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeCreator%23node-created">Online Documentation</a>
 */
inline fun <TDataItem> NodeCreator<TDataItem>.addNodeCreatedHandler(
  crossinline handler: (event:GraphBuilderItemEventArgs<INode, TDataItem>) -> Unit
): () -> Unit {
  val listener: EventHandler1<GraphBuilderItemEventArgs<INode, TDataItem>> = { event, _ -> handler(event) }
  addEventListener("node-created", listener)
  return { removeEventListener("node-created", listener) }
}

/**
 * `node-updated`: Occurs when a node has been updated.
 * @see [addNodeCreatedHandler]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeCreator%23node-updated">Online Documentation</a>
 */
inline fun <TDataItem> NodeCreator<TDataItem>.addNodeUpdatedHandler(
  crossinline handler: (event:GraphBuilderItemEventArgs<INode, TDataItem>) -> Unit
): () -> Unit {
  val listener: EventHandler1<GraphBuilderItemEventArgs<INode, TDataItem>> = { event, _ -> handler(event) }
  addEventListener("node-updated", listener)
  return { removeEventListener("node-updated", listener) }
}
