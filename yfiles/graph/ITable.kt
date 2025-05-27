// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graph

import yfiles.collections.IEnumerable
import yfiles.collections.ILookup
import yfiles.collections.ItemEventArgs
import yfiles.geometry.IRectangle
import yfiles.geometry.Insets
import yfiles.geometry.Point
import yfiles.geometry.Rect
import yfiles.geometry.Size
import yfiles.input.IInputModeContext
import yfiles.input.StripeSubregion
import yfiles.input.StripeSubregionTypes
import yfiles.lang.EventHandler1
import yfiles.lang.IEventDispatcher
import yfiles.lang.InterfaceMetadata
import yfiles.lang.Predicate
import yfiles.styles.ILabelStyle
import yfiles.styles.IStripeStyle

/**
 * Central interface which provides support for tabular data presentation.
 * @see [IStripe]
 * @see [IColumn]
 * @see [IRow]
 * @see [Table]
 * @see [TableEditorInputMode][yfiles.input.TableEditorInputMode]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ITable">Online Documentation</a>
 */
external interface ITable : ILookup, IEventDispatcher {
  /**
   * Returns the accumulated padding for the table.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ITable%23accumulatedPadding">Online Documentation</a>
   */
  final val accumulatedPadding: Insets
  
  /**
   * Gets or sets the defaults for Columns.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ITable%23columnDefaults">Online Documentation</a>
   */
  var columnDefaults: IStripeDefaults
  
  /**
   * Gets a [TableDecorator] instance for use with this table.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ITable%23decorator">Online Documentation</a>
   */
  final val decorator: TableDecorator
  
  /**
   * Gets the layout of the table, relative to an owner node.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ITable%23layout">Online Documentation</a>
   */
  val layout: IRectangle
  
  /**
   * Gets or sets the padding for this table.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ITable%23padding">Online Documentation</a>
   */
  var padding: Insets
  
  /**
   * Gets the virtual root of the column hierarchy
   * @see [setParent]
   * @see [createChildColumn]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ITable%23rootColumn">Online Documentation</a>
   */
  val rootColumn: IColumn
  
  /**
   * Gets the virtual root of the row hierarchy
   * @see [setParent]
   * @see [createChildRow]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ITable%23rootRow">Online Documentation</a>
   */
  val rootRow: IRow
  
  /**
   * Gets or sets the defaults for rows.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ITable%23rowDefaults">Online Documentation</a>
   */
  var rowDefaults: IStripeDefaults
  
  /**
   * Add a label to the given owner using the text as the initial label text and label model parameter and style.
   * @param [owner] The owner to add the label to.
   * @param [text] The initial text of the label
   * @param [layoutParameter] The label model parameter instance to use.
   * @param [style] The style to use for the label
   * @param [preferredSize] The initial values to use for the [preferredSize][ILabel].
   * @param [tag] The initial [tag][yfiles.collections.ITagOwner] to assign.
   * @return The newly created label
   * @see [setLabelText]
   * @see [setLabelLayoutParameter]
   * @see [setStyle]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ITable%23ITable-method-addLabel">Online Documentation</a>
   */
  fun addLabel(
    owner: IStripe,
    text: String,
    layoutParameter: ILabelModelParameter?  = definedExternally,
    style: ILabelStyle?  = definedExternally,
    preferredSize: Size?  = definedExternally,
    tag: Tag?  = definedExternally,
  ): ILabel
  
  /**
   * Adjusts the [preferredSize][ILabel] property of a label to fit the suggested size of its [ILabelStyleRenderer].
   * @param [label] The label to adjust the size for.
   * @see [ILabelDefaults.autoAdjustPreferredSize]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ITable%23ITable-defaultmethod-adjustLabelPreferredSize">Online Documentation</a>
   */
  final fun adjustLabelPreferredSize(
    label: ILabel,
  ): Unit = definedExternally
  
  /**
   * Calculates the preferred size of a label with the given properties.
   * @param [stripe] The item that will own the label.
   * @param [style] The label style.
   * @param [layoutParameter] The label model parameter.
   * @param [text] The text.
   * @param [tag] The tag for the label.
   * @return The size as calculated by the [ILabelStyleRenderer].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ITable%23ITable-defaultmethod-calculateLabelPreferredSize">Online Documentation</a>
   */
  final fun calculateLabelPreferredSize(
    stripe: IStripe,
    style: ILabelStyle,
    layoutParameter: ILabelModelParameter,
    text: String,
    tag: Tag?,
  ): Size = definedExternally
  
  /**
   * Removes all stripes from a table.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ITable%23ITable-defaultmethod-clear">Online Documentation</a>
   */
  final fun clear(): Unit = definedExternally
  
  /**
   * Create a new column as the `index`th child of `parent` with the given parameters.
   * @param [parent] The owner of the new column.
   * @param [width] The actual width of the column.
   * @param [minWidth] The minimal width of the column.
   * @param [padding] The padding of the column.
   * @param [style] The style of the column.
   * @param [tag] The tag of the column
   * @param [index] The position in the child list.
   * @return A new column instance
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ITable%23ITable-method-createChildColumn">Online Documentation</a>
   */
  fun createChildColumn(
    parent: IColumn?,
    width: Double  = definedExternally,
    minWidth: Double  = definedExternally,
    padding: Insets  = definedExternally,
    style: IStripeStyle  = definedExternally,
    tag: Tag?  = definedExternally,
    index: Int?  = definedExternally,
  ): IColumn
  
  /**
   * Create a new row as the `index`th child of `parent` with the given parameters.
   * @param [parent] The owner of the new row.
   * @param [height] The actual height of the row.
   * @param [minHeight] The minimal height of the row.
   * @param [padding] The padding of the row.
   * @param [style] The style of the row.
   * @param [tag] The tag of the row
   * @param [index] The position in the child list.
   * @return A new row instance
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ITable%23ITable-method-createChildRow">Online Documentation</a>
   */
  fun createChildRow(
    parent: IRow?,
    height: Double  = definedExternally,
    minHeight: Double  = definedExternally,
    padding: Insets  = definedExternally,
    style: IStripeStyle  = definedExternally,
    tag: Tag?  = definedExternally,
    index: Int?  = definedExternally,
  ): IRow
  
  /**
   * Creates and returns a column as last child of `table`.
   * @param [width] The actual width of the column.
   * @param [minWidth] The minimal width of the column.
   * @param [padding] The padding of the column.
   * @param [style] The style of the column.
   * @param [tag] The tag of the column
   * @param [index] The position in the child list. If omitted, the row will be positioned at the end.
   * @return A newly created column instance
   * @see [stripe-created]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ITable%23ITable-defaultmethod-createColumn">Online Documentation</a>
   */
  final fun createColumn(
    width: Double  = definedExternally,
    minWidth: Double  = definedExternally,
    padding: Insets  = definedExternally,
    style: IStripeStyle  = definedExternally,
    tag: Tag?  = definedExternally,
    index: Int  = definedExternally,
  ): IColumn = definedExternally
  
  /**
   * Creates a `columns` x `rows`.
   * @param [columns] The number of columns to test.
   * @param [rows] The number of rows to test.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ITable%23ITable-defaultmethod-createGrid">Online Documentation</a>
   */
  final fun createGrid(
    columns: Int,
    rows: Int,
  ): Unit = definedExternally
  
  /**
   * Creates the label model parameter for a given [ILabelOwner].
   * @param [stripe] The item that is the [owner][ILabel] of the label in question.
   * @return The default label model parameter to use for newly created labels at the item.
   * @see [ILabelDefaults.getLayoutParameterInstance]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ITable%23ITable-defaultmethod-createLabelLayoutParameter">Online Documentation</a>
   */
  final fun createLabelLayoutParameter(
    stripe: IStripe,
  ): ILabelModelParameter = definedExternally
  
  /**
   * Creates an instance of the [default label style][ILabelDefaults] for the given `stripe`.
   * @param [stripe] The item the newly created label will belong to.
   * @return The style instance to use for newly created stripes.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ITable%23ITable-defaultmethod-createLabelStyle">Online Documentation</a>
   */
  final fun createLabelStyle(
    stripe: IStripe,
  ): ILabelStyle = definedExternally
  
  /**
   * Creates and returns a row as last child of `table`.
   * @param [height] The actual height of the row.
   * @param [minHeight] The minimal height of the row.
   * @param [padding] The padding of the row.
   * @param [style] The style of the row.
   * @param [tag] The tag of the row
   * @param [index] The position in the child list. If omitted, the row will be positioned at the end.
   * @return A newly created row instance
   * @see [stripe-created]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ITable%23ITable-defaultmethod-createRow">Online Documentation</a>
   */
  final fun createRow(
    height: Double  = definedExternally,
    minHeight: Double  = definedExternally,
    padding: Insets  = definedExternally,
    style: IStripeStyle  = definedExternally,
    tag: Tag?  = definedExternally,
    index: Int  = definedExternally,
  ): IRow = definedExternally
  
  /**
   * Finds a column underneath a certain point.
   * @param [node] The node this table is currently bound to
   * @param [location] The location to test.
   * @param [filter] Additional predicate to further restrict the results.
   * @return The topmost column that has been found for the location or `null`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ITable%23ITable-defaultmethod-findColumn">Online Documentation</a>
   */
  final fun findColumn(
    node: INode,
    location: Point,
    filter: Predicate<IStripe>  = definedExternally,
  ): IColumn? = definedExternally
  
  /**
   * Finds a row underneath a certain point.
   * @param [node] The node this table is currently bound to
   * @param [location] The location to test.
   * @param [filter] Additional predicate to further restrict the results.
   * @return The topmost row that has been found for the location or `null`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ITable%23ITable-defaultmethod-findRow">Online Documentation</a>
   */
  final fun findRow(
    node: INode,
    location: Point,
    filter: Predicate<IStripe>  = definedExternally,
  ): IRow? = definedExternally
  
  /**
   * Finds all stripes underneath a certain point.
   * @param [node] The node this table is currently bound to
   * @param [location] The location to test.
   * @param [stripeTypes] An enumeration value of [StripeTypes] to specify the stripe type.
   * @param [filter] Additional predicate to further restrict the hit test results.
   * @return The stripes that have been found for the location or `null`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ITable%23ITable-defaultmethod-findStripes">Online Documentation</a>
   */
  final fun findStripes(
    node: INode,
    location: Point,
    stripeTypes: StripeTypes,
    filter: Predicate<IStripe>  = definedExternally,
  ): IEnumerable<IStripe> = definedExternally
  
  /**
   * Calculates the relative bounds of a table cell that is determined by `column` and `row`
   * @param [column] The column that determines the cell
   * @param [row] The row that determines the cell
   * @return The relative bounds of the cell determined by `column` and `row`
   * @throws ArgumentError If `column` and `row` are part of a different table instance.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ITable%23ITable-defaultmethod-getCellBounds">Online Documentation</a>
   */
  final fun getCellBounds(
    column: IColumn,
    row: IRow,
  ): Rect = definedExternally
  
  /**
   * Removes the given label from its owner.
   * @param [label] The label to remove
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ITable%23ITable-method-remove(ILabel)">Online Documentation</a>
   */
  fun remove(
    label: ILabel,
  )
  
  /**
   * Removes the given label from its owner.
   * @param [label] The label to remove
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ITable%23ITable-method-remove(ILabel)">Online Documentation</a>
   */
  @JsName("remove")
  final operator fun minusAssign(
    label: ILabel,
  ): Unit = definedExternally
  
  /**
   * Removes `stripe` from its parent container.
   * @param [stripe] The stripe to remove
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ITable%23ITable-method-remove(IStripe)">Online Documentation</a>
   */
  fun remove(
    stripe: IStripe,
  )
  
  /**
   * Removes `stripe` from its parent container.
   * @param [stripe] The stripe to remove
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ITable%23ITable-method-remove(IStripe)">Online Documentation</a>
   */
  @JsName("remove")
  final operator fun minusAssign(
    stripe: IStripe,
  ): Unit = definedExternally
  
  /**
   * [Removes][ITable] `stripe` and all of its descendants from `table`.
   * @param [stripe] The stripe to remove.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ITable%23ITable-defaultmethod-removeRecursively">Online Documentation</a>
   */
  final fun removeRecursively(
    stripe: IStripe,
  ): Unit = definedExternally
  
  /**
   * [Removes][ITable] the given `stripe` and all of its descendants from `table` and resizes all affected stripes so that the table size does not change if possible.
   * @param [stripe] The stripe to remove.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ITable%23ITable-defaultmethod-removeRecursivelyWithResize">Online Documentation</a>
   */
  final fun removeRecursivelyWithResize(
    stripe: IStripe,
  ): Unit = definedExternally
  
  /**
   * [Removes][ITable] `stripe` from `table` and resizes all affected stripes so that the table size does not change if possible.
   * @param [stripe] The stripe to remove.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ITable%23ITable-defaultmethod-removeWithResize">Online Documentation</a>
   */
  final fun removeWithResize(
    stripe: IStripe,
  ): Unit = definedExternally
  
  /**
   * Sets the label model parameter for the given label.
   * @param [label] The label.
   * @param [layoutParameter] The new parameter.
   * @throws ArgumentError If the parameter cannot be used for this label.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ITable%23ITable-method-setLabelLayoutParameter">Online Documentation</a>
   */
  fun setLabelLayoutParameter(
    label: ILabel,
    layoutParameter: ILabelModelParameter,
  )
  
  /**
   * Sets the preferred size of the label.
   * @param [label] The label.
   * @param [preferredSize] The new preferred size.
   * @see [ILabel.preferredSize]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ITable%23ITable-method-setLabelPreferredSize">Online Documentation</a>
   */
  fun setLabelPreferredSize(
    label: ILabel,
    preferredSize: Size,
  )
  
  /**
   * Sets the label text of the given label.
   * @param [label] The label to modify
   * @param [text] The new text of the label
   * @see [ILabel.text]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ITable%23ITable-method-setLabelText">Online Documentation</a>
   */
  fun setLabelText(
    label: ILabel,
    text: String,
  )
  
  /**
   * Sets the minimum size of `stripe`.
   * @param [stripe] The stripe to change
   * @param [minimumSize] The new minimum size of the stripe
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ITable%23ITable-method-setMinimumSize">Online Documentation</a>
   */
  fun setMinimumSize(
    stripe: IStripe,
    minimumSize: Double,
  )
  
  /**
   * Sets `parent` as new parent of `row`, inserting `row` at the given `index`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ITable%23ITable-method-setParent(IRow,IRow,number)">Online Documentation</a>
   */
  fun setParent(
    parent: IRow,
    row: IRow,
    index: Int?  = definedExternally,
  )
  
  /**
   * Sets `parent` as new parent of `column`, inserting `column` at the given `index`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ITable%23ITable-method-setParent(IColumn,IColumn,number)">Online Documentation</a>
   */
  fun setParent(
    parent: IColumn,
    column: IColumn,
    index: Int?  = definedExternally,
  )
  
  /**
   * Sets the actual size of `stripe`.
   * @param [stripe] The stripe to change
   * @param [size] The new size of the stripe
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ITable%23ITable-method-setSize">Online Documentation</a>
   */
  fun setSize(
    stripe: IStripe,
    size: Int,
  )
  
  /**
   * Sets the padding of `stripe`.
   * @param [stripe] The stripe to change
   * @param [padding] The new padding of the stripe
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ITable%23ITable-method-setStripePadding">Online Documentation</a>
   */
  fun setStripePadding(
    stripe: IStripe,
    padding: Insets,
  )
  
  /**
   * Assigns the given style instance by reference to the label.
   * @param [label] The label that will be assigned the new style
   * @param [style] The style instance that will be assigned to the label.
   * @see [ILabel.style]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ITable%23ITable-method-setStyle(ILabel,ILabelStyle)">Online Documentation</a>
   */
  fun setStyle(
    label: ILabel,
    style: ILabelStyle,
  )
  
  /**
   * Sets the style of `stripe`.
   * @param [stripe] The stripe to change
   * @param [style] The new style of the stripe
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ITable%23ITable-method-setStyle(IStripe,IStripeStyle)">Online Documentation</a>
   */
  fun setStyle(
    stripe: IStripe,
    style: IStripeStyle,
  )

  
  companion object : InterfaceMetadata<ITable> {
    /**
     * Finds a stripe underneath a certain point.
     * @param [location] The location to test.
     * @param [stripeTypes] An enumeration value of [StripeTypes] to specify the stripe type.
     * @param [subregionTypes] An enumeration value of [StripeSubregionTypes] to further restrict the stripe region.
     * @param [inputModeContext] The context for hit determination, such as [hitTestRadius][yfiles.view.ICanvasContext].
     * @param [filter] Additional predicate to further restrict the hit test results.
     * @return The stripe subregions that have been found for the location or `null`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ITable%23ITable-defaultmethod-findStripe">Online Documentation</a>
     */
    fun findStripe(
      location: Point,
      stripeTypes: StripeTypes,
      subregionTypes: StripeSubregionTypes,
      inputModeContext: IInputModeContext,
      filter: Predicate<StripeSubregion>  = definedExternally,
    ): StripeSubregion?
    
    /**
     * Used as a callback to find the items underneath a certain point.
     * @param [location] The location to test.
     * @param [stripeTypes] An enumeration value of [StripeTypes] to specify the stripe type.
     * @param [subregionTypes] An enumeration value of [StripeSubregionTypes] to further restrict the stripe region.
     * @param [inputModeContext] The context for hit determination, such as [hitTestRadius][yfiles.view.ICanvasContext].
     * @param [filter] Additional predicate to further restrict the hit test results.
     * @return The stripe subregions that have been found for the location.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ITable%23ITable-defaultmethod-findStripes">Online Documentation</a>
     */
    fun findStripes(
      location: Point,
      stripeTypes: StripeTypes,
      subregionTypes: StripeSubregionTypes,
      inputModeContext: IInputModeContext,
      filter: Predicate<StripeSubregion>  = definedExternally,
    ): IEnumerable<StripeSubregion>
    
    /**
     * Calculates the absolute bounds of a table cell that is determined by `column` and `row`
     * @receiver The node where a table is bound to via the node's lookup
     * @param [column] The column that determines the cell
     * @param [row] The row that determines the cell
     * @return The absolute bounds of the cell determined by `column` and `row`
     * @throws ArgumentError If no table is present in the [ILookup] of `tableNode`, or if `column` and `row` are part of a different table instance.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ITable%23ITable-defaultmethod-getCellBounds">Online Documentation</a>
     */
    fun INode.getCellBounds(
      column: IColumn,
      row: IRow,
    ): Rect
    
    /**
     * Gets the [ITable] instance associated to the given node.
     * @return The [ITable] instance associated to the given node or `null` if there is none.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ITable%23ITable-defaultmethod-getTable">Online Documentation</a>
     */
    fun getTable(
      node: INode,
    ): ITable?
    
    /**
     * Places `node` in the center of the table cell determined by `column` and `row`.
     * @receiver The graph instance where the move should be performed
     * @param [node] The node that should be moved into the given cell.
     * @param [tableNode] The node where a table is bound to via the node's lookup
     * @param [column] The column that determines the cell
     * @param [row] The row that determines the cell
     * @param [reparent] Whether `node` should also be made part of `tableNode`'s grouping hierarchy if it is not yet contained in it.
     * @param [alwaysMove] Whether `node` should be moved even if it is already placed in the cell.
     * @throws ArgumentError If no table is present in the [ILookup] of `tableNode`, or if `column` and `row` are part of a different table instance.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ITable%23ITable-defaultmethod-placeNodeInCell">Online Documentation</a>
     */
    fun IGraph.placeNodeInCell(
      node: INode,
      tableNode: INode,
      column: IColumn,
      row: IRow,
      reparent: Boolean  = definedExternally,
      alwaysMove: Boolean  = definedExternally,
    )
  }
}

/**
 * `label-added`: Occurs when a label has been added to this graph instance.
 * @see [addAddLabelHandler]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ITable%23label-added">Online Documentation</a>
 */
inline fun  ITable.addLabelAddedHandler(
  crossinline handler: (item:ILabel) -> Unit
): () -> Unit {
  val listener: EventHandler1<ItemEventArgs<ILabel>> = { event, _ -> handler(event.item) }
  addEventListener("label-added", listener)
  return { removeEventListener("label-added", listener) }
}
/**
 * `label-removed`: Occurs when a label has been removed from this graph instance.
 * @see [addRemove]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ITable%23label-removed">Online Documentation</a>
 */
inline fun  ITable.addLabelRemovedHandler(
  crossinline handler: (event:LabelEventArgs) -> Unit
): () -> Unit {
  val listener: EventHandler1<LabelEventArgs> = { event, _ -> handler(event) }
  addEventListener("label-removed", listener)
  return { removeEventListener("label-removed", listener) }
}
/**
 * `label-changed`: Occurs when a label has been changed, for instance, if its style has been replaced.
 * @see [addSetStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ITable%23label-changed">Online Documentation</a>
 */
inline fun  ITable.addLabelChangedHandler(
  crossinline handler: (item:ILabel) -> Unit
): () -> Unit {
  val listener: EventHandler1<ItemEventArgs<ILabel>> = { event, _ -> handler(event.item) }
  addEventListener("label-changed", listener)
  return { removeEventListener("label-changed", listener) }
}
/**
 * `stripe-created`: Occurs when a stripe has been added.
 * @see [addCreateChildRowHandler]
 * @see [addCreateChildColumnHandler]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ITable%23stripe-created">Online Documentation</a>
 */
inline fun  ITable.addStripeCreatedHandler(
  crossinline handler: (item:IStripe) -> Unit
): () -> Unit {
  val listener: EventHandler1<ItemEventArgs<IStripe>> = { event, _ -> handler(event.item) }
  addEventListener("stripe-created", listener)
  return { removeEventListener("stripe-created", listener) }
}
/**
 * `stripe-removed`: Occurs when a stripe has been removed from its parent.
 * @see [addRemove]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ITable%23stripe-removed">Online Documentation</a>
 */
inline fun  ITable.addStripeRemovedHandler(
  crossinline handler: (event:StripeEventArgs) -> Unit
): () -> Unit {
  val listener: EventHandler1<StripeEventArgs> = { event, _ -> handler(event) }
  addEventListener("stripe-removed", listener)
  return { removeEventListener("stripe-removed", listener) }
}
/**
 * `stripe-changed`: Occurs when a stripe has been changed, for instance, if its style has been replaced.
 * @see [addSetStyle]
 * @see [addSetStripePaddingHandler]
 * @see [addSetSizeHandler]
 * @see [addSetMinimumSizeHandler]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ITable%23stripe-changed">Online Documentation</a>
 */
inline fun  ITable.addStripeChangedHandler(
  crossinline handler: (event:StripeEventArgs) -> Unit
): () -> Unit {
  val listener: EventHandler1<StripeEventArgs> = { event, _ -> handler(event) }
  addEventListener("stripe-changed", listener)
  return { removeEventListener("stripe-changed", listener) }
}
