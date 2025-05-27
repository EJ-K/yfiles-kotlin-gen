// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.binding

import yfiles.geometry.Size
import yfiles.graph.IGraph
import yfiles.graph.ILabel
import yfiles.graph.ILabelDefaults
import yfiles.graph.ILabelModelParameter
import yfiles.graph.ILabelOwner
import yfiles.graph.Tag
import yfiles.lang.ClassMetadata
import yfiles.lang.EventHandler1
import yfiles.lang.IEventDispatcher
import yfiles.styles.ILabelStyle

/**
 * This class can be used to create and update [ILabel]s based on data items.
 * @param [TDataItem] The type of the data items in the source.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelCreator">Online Documentation</a>
 * 
 * @constructor Creates a new creator for labels.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelCreator%23LabelCreator-constructor-LabelCreator">Online Documentation</a>
 */
open external class LabelCreator<TDataItem> () : IEventDispatcher {
  /**
   * Gets or sets a set of [ILabelDefaults] that will be used for the labels.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelCreator%23defaults">Online Documentation</a>
   */
  final var defaults: ILabelDefaults
  
  /**
   * Gets or sets an optional provider of a label model parameter that will be used as the label's [layoutParameter][ILabel] for the source data item.
   * @see [getLayoutParameter]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelCreator%23layoutParameterProvider">Online Documentation</a>
   */
  final var layoutParameterProvider: Provider<TDataItem, ILabelModelParameter>?
  
  /**
   * Gets or sets an optional binding that will be [applied][LabelCreator] to the label.
   * @see [applyPreferredSizeBindings]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelCreator%23preferredSizeBindings">Online Documentation</a>
   */
  final var preferredSizeBindings: ObjectBindings<TDataItem>
  
  /**
   * Gets or sets an optional provider of the size that will be used as the label's [preferredSize][ILabel] for the source data item.
   * @see [getPreferredSize]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelCreator%23preferredSizeProvider">Online Documentation</a>
   */
  final var preferredSizeProvider: Provider<TDataItem, Size>?
  
  /**
   * Gets or sets an optional set of bindings that will be [applied][LabelCreator] to the label's [style][ILabel].
   * @see [applyStyleBindings]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelCreator%23styleBindings">Online Documentation</a>
   */
  final var styleBindings: ObjectBindings<TDataItem>
  
  /**
   * Gets or sets an optional provider of an [ILabelStyle] instance that will be used as the label's [style][ILabel] for the source data item.
   * 
   * By default the [defaults][LabelCreator]' [style][ILabelDefaults] will be used. Note that [shareStyleInstance][ILabelDefaults] will be ignored if this provider returns a value. Use the [styleBindings][LabelCreator] to reconfigure properties of the style instances.
   * @see [getStyle]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelCreator%23styleProvider">Online Documentation</a>
   */
  final var styleProvider: Provider<TDataItem, ILabelStyle>?
  
  /**
   * Gets or sets an optional provider of an object that will be used as the label's [tag][yfiles.collections.ITagOwner] for the source data item.
   * 
   * By default the source data item itself will be used as the tag.
   * @see [getTag]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelCreator%23tagProvider">Online Documentation</a>
   */
  final var tagProvider: Provider<TDataItem, Any>?
  
  /**
   * Gets or sets an optional provider of the text that will be used as the label's [text][ILabel] for the source data item.
   * @see [getText]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelCreator%23textProvider">Online Documentation</a>
   */
  final var textProvider: Provider<TDataItem, String>?
  
  /**
   * Adds a label on the given [ILabelOwner] with the values of the bindings resolved against the `dataItem`.
   * @param [graph] The graph.
   * @param [owner] The owner to which the label should be added.
   * @param [dataItem] The data item for which to create the label.
   * @return The newly added label.
   * @see [getLayoutParameter]
   * @see [getPreferredSize]
   * @see [getText]
   * @see [getStyle]
   * @see [getTag]
   * @see [applyPreferredSizeBindings]
   * @see [applyStyleBindings]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelCreator%23LabelCreator-method-addLabel">Online Documentation</a>
   */
  open fun addLabel(
    graph: IGraph,
    owner: ILabelOwner,
    dataItem: TDataItem,
  ): ILabel?
  
  /**
   * Called from [addLabel][LabelCreator] and performs the actual label creation in the graph.
   * @param [graph] The graph to create the node in.
   * @param [owner] The owner to which the label should be added.
   * @param [text] The label's text.
   * @param [layoutParameter] The layout parameter of the label.
   * @param [style] The style of the label.
   * @param [preferredSize] The preferred size of the label.
   * @param [tag] The tag of the node.
   * @return The newly added label.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelCreator%23LabelCreator-method-addLabelCore">Online Documentation</a>
   */
  protected open fun addLabelCore(
    graph: IGraph,
    owner: ILabelOwner,
    text: String,
    layoutParameter: ILabelModelParameter,
    style: ILabelStyle,
    preferredSize: Size?,
    tag: Tag?,
  ): ILabel
  
  /**
   * Resolves the [preferredSizeBindings][LabelCreator] against the given `dataItem` and applies them to the given `label` preferredSize.
   * @param [graph] The managed graph.
   * @param [label] The label to update.
   * @param [dataItem] The data item that is used.
   * @see [updatePreferredSize]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelCreator%23LabelCreator-method-applyPreferredSizeBindings">Online Documentation</a>
   */
  fun applyPreferredSizeBindings(
    graph: IGraph,
    label: ILabel,
    dataItem: TDataItem,
  )
  
  /**
   * Resolves the [styleBindings][LabelCreator] against the given `dataItem` and applies them to the given `label` style.
   * @param [graph] The managed graph.
   * @param [label] The label to update.
   * @param [dataItem] The data item that is used.
   * @see [updateStyle]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelCreator%23LabelCreator-method-applyStyleBindings">Online Documentation</a>
   */
  fun applyStyleBindings(
    graph: IGraph,
    label: ILabel,
    dataItem: TDataItem,
  )
  
  /**
   * Obtains a [layoutParameter][ILabel] instance or `null` by resolving [layoutParameterProvider][LabelCreator] on the data item.
   * @param [dataItem] The data item on which the provider is resolved.
   * @return The value to use or `null` in case the defaults should be used.
   * @see [layoutParameterProvider]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelCreator%23LabelCreator-method-getLayoutParameter">Online Documentation</a>
   */
  protected open fun getLayoutParameter(
    dataItem: TDataItem,
  ): ILabelModelParameter?
  
  /**
   * Obtains a [preferredSize][ILabel] or `null` by resolving the [preferredSizeProvider][LabelCreator] on the data item.
   * @param [dataItem] The data item on which the provider is resolved.
   * @return The value to use or `null` in case the defaults should be used.
   * @see [preferredSizeProvider]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelCreator%23LabelCreator-method-getPreferredSize">Online Documentation</a>
   */
  protected open fun getPreferredSize(
    dataItem: TDataItem,
  ): Size?
  
  /**
   * Obtains an [ILabelStyle] instance or `null` by resolving the [styleProvider][LabelCreator].
   * @param [dataItem] The data item on which the provider is resolved.
   * @return The value to use or `null` in case the defaults should be used.
   * @see [styleProvider]
   * @see [styleBindings]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelCreator%23LabelCreator-method-getStyle">Online Documentation</a>
   */
  protected open fun getStyle(
    dataItem: TDataItem,
  ): ILabelStyle?
  
  /**
   * Obtains an `object` to use as [tag][yfiles.collections.ITagOwner] by resolving the [tagProvider][LabelCreator] on the data item.
   * @param [dataItem] The data item on which the provider is resolved.
   * @return The value to use or `null` in case the defaults should be used.
   * @see [tagProvider]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelCreator%23LabelCreator-method-getTag">Online Documentation</a>
   */
  protected open fun getTag(
    dataItem: TDataItem,
  ): Any?
  
  /**
   * Obtains a `string` to use as [text][ILabel] or `null` by resolving the [textProvider][LabelCreator] on the data item.
   * @param [dataItem] The data item on which the provider is resolved.
   * @return The value to use or `null` in case no text should be added.
   * @see [textProvider]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelCreator%23LabelCreator-method-getText">Online Documentation</a>
   */
  protected open fun getText(
    dataItem: TDataItem,
  ): String?
  
  /**
   * Resolves the [layoutParameterProvider][LabelCreator] on the given data item.
   * @param [graph] The managed graph.
   * @param [label] The label to update.
   * @param [dataItem] The data item that is used.
   * @return The new layout parameter instance. Either the value returned by [getLayoutParameter][LabelCreator], or the [default layout parameter][LabelCreator], if [getLayoutParameter][LabelCreator] returns `null`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelCreator%23LabelCreator-method-getUpdatedLayoutParameter">Online Documentation</a>
   */
  protected open fun getUpdatedLayoutParameter(
    graph: IGraph,
    label: ILabel,
    dataItem: TDataItem,
  ): ILabelModelParameter
  
  /**
   * Resolves the [preferredSizeProvider][LabelCreator] and then [applies the preferred size bindings][LabelCreator].
   * @param [graph] The managed graph.
   * @param [label] The label for which the size should be updated.
   * @param [dataItem] The data item that is used.
   * @return Returns the label's new preferred size.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelCreator%23LabelCreator-method-getUpdatedPreferredSize">Online Documentation</a>
   */
  protected open fun getUpdatedPreferredSize(
    graph: IGraph,
    label: ILabel,
    dataItem: TDataItem,
  ): Size
  
  /**
   * Resolves the [styleProvider][LabelCreator] and then [applies the style bindings][LabelCreator].
   * @param [graph] The managed graph.
   * @param [label] The label to update.
   * @param [dataItem] The data item that is used.
   * @return The updated style instance. Either the value returned by [getStyle][LabelCreator], or the [default style][LabelCreator], if [getStyle][LabelCreator] returns `null`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelCreator%23LabelCreator-method-getUpdatedStyle">Online Documentation</a>
   */
  protected open fun getUpdatedStyle(
    graph: IGraph,
    label: ILabel,
    dataItem: TDataItem,
  ): ILabelStyle
  
  /**
   * Resolves the [tagProvider][LabelCreator] on the given data item.
   * @param [graph] The managed graph.
   * @param [label] The label for which the new tag should be obtained.
   * @param [dataItem] The data item that is used.
   * @return Returns the updated tag object.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelCreator%23LabelCreator-method-getUpdatedTag">Online Documentation</a>
   */
  protected open fun getUpdatedTag(
    graph: IGraph,
    label: ILabel,
    dataItem: TDataItem,
  ): Any?
  
  /**
   * Resolves the [textProvider][LabelCreator] on the given data item.
   * @param [graph] The managed graph.
   * @param [label] The label for which the new text should be obtained.
   * @param [dataItem] The data item that is used.
   * @return Returns the new text.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelCreator%23LabelCreator-method-getUpdatedText">Online Documentation</a>
   */
  protected open fun getUpdatedText(
    graph: IGraph,
    label: ILabel,
    dataItem: TDataItem,
  ): String
  
  /**
   * Triggers the [label-added][LabelCreator] event.
   * @param [graph] The graph in which the label has been added.
   * @param [dataItem] The data item from which the label has been created.
   * @param [label] The label that has been added.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelCreator%23LabelCreator-method-onLabelAdded">Online Documentation</a>
   */
  protected open fun onLabelAdded(
    graph: IGraph,
    dataItem: TDataItem,
    label: ILabel,
  )
  
  /**
   * Triggers the [label-updated][LabelCreator] event.
   * @param [graph] The graph in which the label has been updated.
   * @param [dataItem] The data item with which the label has been updated.
   * @param [label] The label that has been updated.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelCreator%23LabelCreator-method-onLabelUpdated">Online Documentation</a>
   */
  protected open fun onLabelUpdated(
    graph: IGraph,
    dataItem: TDataItem,
    label: ILabel,
  )
  
  /**
   * Updates the label.
   * @param [graph] The graph that contains the edge.
   * @param [label] The label to update.
   * @param [dataItem] The data item with which the label should be updated.
   * @return `true` if the label has been updated. If `false` the label information has been removed from `dataItem` and therefore the label will be removed, too.
   * @see [updateLayoutParameter]
   * @see [updatePreferredSize]
   * @see [updateStyle]
   * @see [updateText]
   * @see [updateTag]
   * @see [applyStyleBindings]
   * @see [applyPreferredSizeBindings]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelCreator%23LabelCreator-method-updateLabel">Online Documentation</a>
   */
  open fun updateLabel(
    graph: IGraph,
    label: ILabel,
    dataItem: TDataItem,
  ): Boolean
  
  /**
   * Updates the [layoutParameter][ILabel] of the `label` with the given `dataItem` by calling [getUpdatedLayoutParameter][LabelCreator] and setting the new parameter on the label.
   * @param [graph] The managed graph.
   * @param [label] The label to update.
   * @param [dataItem] The data item that is used for the update.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelCreator%23LabelCreator-method-updateLayoutParameter">Online Documentation</a>
   */
  fun updateLayoutParameter(
    graph: IGraph,
    label: ILabel,
    dataItem: TDataItem,
  )
  
  /**
   * Updates the [preferredSize][ILabel] of the `label` with the given `dataItem` by calling [getUpdatedPreferredSize][LabelCreator] and setting the new size on the label.
   * @param [graph] The managed graph.
   * @param [label] The label to update.
   * @param [dataItem] The data item that is used for the update.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelCreator%23LabelCreator-method-updatePreferredSize">Online Documentation</a>
   */
  fun updatePreferredSize(
    graph: IGraph,
    label: ILabel,
    dataItem: TDataItem,
  )
  
  /**
   * Updates the style of the `label` with the given `dataItem` by calling [getUpdatedStyle][LabelCreator] and applying the style to the node in the graph.
   * @param [graph] The managed graph.
   * @param [label] The label to update.
   * @param [dataItem] The data item that is used for the update.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelCreator%23LabelCreator-method-updateStyle">Online Documentation</a>
   */
  fun updateStyle(
    graph: IGraph,
    label: ILabel,
    dataItem: TDataItem,
  )
  
  /**
   * Updates the [tag][yfiles.collections.ITagOwner] of the `label` with the given `dataItem` by calling [getUpdatedTag][LabelCreator] and setting the new `tag` on the label.
   * @param [graph] The managed graph.
   * @param [label] The label to update.
   * @param [dataItem] The data item that is used for the update.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelCreator%23LabelCreator-method-updateTag">Online Documentation</a>
   */
  fun updateTag(
    graph: IGraph,
    label: ILabel,
    dataItem: TDataItem,
  )
  
  /**
   * Updates the [text][ILabel] of the `label` with the given `dataItem` by calling [getUpdatedText][LabelCreator] and setting the new text on the label.
   * @param [graph] The managed graph.
   * @param [label] The label to update.
   * @param [dataItem] The data item that is used for the update.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelCreator%23LabelCreator-method-updateText">Online Documentation</a>
   */
  fun updateText(
    graph: IGraph,
    label: ILabel,
    dataItem: TDataItem,
  )
  
  companion object : ClassMetadata<LabelCreator<*>> {
  }
}

/**
 * `label-added`: Occurs when a label has been added.
 * @see [addLabelUpdatedHandler]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelCreator%23label-added">Online Documentation</a>
 */
inline fun <TDataItem> LabelCreator<TDataItem>.addLabelAddedHandler(
  crossinline handler: (event:GraphBuilderItemEventArgs<ILabel, TDataItem>) -> Unit
): () -> Unit {
  val listener: EventHandler1<GraphBuilderItemEventArgs<ILabel, TDataItem>> = { event, _ -> handler(event) }
  addEventListener("label-added", listener)
  return { removeEventListener("label-added", listener) }
}

/**
 * `label-updated`: Occurs when a label has been updated.
 * @see [addLabelAddedHandler]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelCreator%23label-updated">Online Documentation</a>
 */
inline fun <TDataItem> LabelCreator<TDataItem>.addLabelUpdatedHandler(
  crossinline handler: (event:GraphBuilderItemEventArgs<ILabel, TDataItem>) -> Unit
): () -> Unit {
  val listener: EventHandler1<GraphBuilderItemEventArgs<ILabel, TDataItem>> = { event, _ -> handler(event) }
  addEventListener("label-updated", listener)
  return { removeEventListener("label-updated", listener) }
}
