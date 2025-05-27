// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graph

import yfiles.collections.IContextLookup
import yfiles.collections.IContextLookupChainLink
import yfiles.collections.ILookupDecorator
import yfiles.collections.LookupDecorator
import yfiles.input.IEditLabelHelper
import yfiles.input.IStripeLabelInputRenderer
import yfiles.lang.ClassMetadata
import yfiles.lang.Func4
import yfiles.lang.IClassMetadata
import yfiles.view.IFocusRenderer
import yfiles.view.IHighlightRenderer
import yfiles.view.ISelectionRenderer

/**
 * Helps in [decorating][ILookupDecorator] the [lookup][yfiles.collections.ILookup] method of [ILabel] instances by providing access to decorators for the most common types.
 * @see [TableDecorator]
 * @see [LookupDecorator]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeLabelDecorator">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [StripeLabelDecorator] class.
 * @param [decorator] The decorator to use.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeLabelDecorator%23StripeLabelDecorator-constructor-StripeLabelDecorator">Online Documentation</a>
 */
external class StripeLabelDecorator (
  decorator: ILookupDecorator  = definedExternally,
)  {
  /**
   * Gets a [LookupDecorator] that decorates the [IEditLabelHelper] type for the [ILabel]s this instance has been created for.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeLabelDecorator%23editLabelHelper">Online Documentation</a>
   */
  final val editLabelHelper: LookupDecorator<ILabel, IEditLabelHelper>
  
  /**
   * Gets a [LookupDecorator] that decorates the [IFocusRenderer] type for the type of items this instance has been created for.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeLabelDecorator%23focusRenderer">Online Documentation</a>
   */
  final val focusRenderer: LookupDecorator<ILabel, IFocusRenderer<ILabel>>
  
  /**
   * Gets a [LookupDecorator] that decorates the [IHighlightRenderer] type for the type of items this instance has been created for.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeLabelDecorator%23highlightRenderer">Online Documentation</a>
   */
  final val highlightRenderer: LookupDecorator<ILabel, IHighlightRenderer<ILabel>>
  
  /**
   * Gets a [LookupDecorator] that decorates the [IStripeLabelInputRenderer] type for the [ILabel]s this instance has been created for.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeLabelDecorator%23inputRenderer">Online Documentation</a>
   */
  final val inputRenderer: LookupDecorator<ILabel, IStripeLabelInputRenderer>
  
  /**
   * Gets a [LookupDecorator] that decorates the [ILabelModelParameterFinder] type for the [ILabel]s this instance has been created for.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeLabelDecorator%23labelModelParameterFinder">Online Documentation</a>
   */
  final val labelModelParameterFinder: LookupDecorator<ILabel, ILabelModelParameterFinder>
  
  /**
   * Gets a [LookupDecorator] that decorates the [ILabelModelParameterProvider] type for the [ILabel]s this instance has been created for.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeLabelDecorator%23labelModelParameterProvider">Online Documentation</a>
   */
  final val labelModelParameterProvider: LookupDecorator<ILabel, ILabelModelParameterProvider>
  
  /**
   * Gets a [LookupDecorator] that decorates the [ISelectionRenderer] type for the type of items this instance has been created for.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeLabelDecorator%23selectionRenderer">Online Documentation</a>
   */
  final val selectionRenderer: LookupDecorator<ILabel, ISelectionRenderer<ILabel>>
  
  /**
   * Adds an [IContextLookupChainLink].
   * @param [link] The lookup chain link to add.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeLabelDecorator%23StripeLabelDecorator-method-add">Online Documentation</a>
   */
  fun add(
    link: IContextLookupChainLink<ILabel>,
  )
  
  /**
   * Adds an [IContextLookupChainLink].
   * @param [link] The lookup chain link to add.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeLabelDecorator%23StripeLabelDecorator-method-add">Online Documentation</a>
   */
  @JsName("add")
  final operator fun plusAssign(
    link: IContextLookupChainLink<ILabel>,
  )
  
  /**
   * Adds a generic callback as a chain link to the lookup.
   * @param [genericLink] The generic callback to add to the lookup chain.
   * @return An [IContextLookupChainLink] that has been [added][ILookupDecorator] to the lookup.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeLabelDecorator%23StripeLabelDecorator-method-addGenericLookup">Online Documentation</a>
   */
  fun addGenericLookup(
    genericLink: Func4<ILabel, IClassMetadata<*>, IContextLookup<*>, Any>,
  ): IContextLookupChainLink<*>
  
  /**
   * Creates a [LookupDecorator] for [ILabel]s that can be used to decorate `TInterface` types of the labels.
   * @param [TInterface] The type of the interface that should be decorated of the instances' [lookup][yfiles.collections.ILookup].
   * @param [interfaceType] The type of the interface that should be decorated of the instances' [lookup][yfiles.collections.ILookup].
   * @return A new [LookupDecorator] for the specified interface.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeLabelDecorator%23StripeLabelDecorator-method-getDecoratorFor">Online Documentation</a>
   */
  fun <TInterface> getDecoratorFor(
    interfaceType: IClassMetadata<TInterface>,
  ): LookupDecorator<ILabel, TInterface>
  
  /**
   * Removes an [IContextLookupChainLink] that has been added by one of the various decorators for stripe labels.
   * @param [link] The lookup chain link to remove.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeLabelDecorator%23StripeLabelDecorator-method-remove">Online Documentation</a>
   */
  fun remove(
    link: IContextLookupChainLink<ILabel>,
  )
  
  /**
   * Removes an [IContextLookupChainLink] that has been added by one of the various decorators for stripe labels.
   * @param [link] The lookup chain link to remove.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeLabelDecorator%23StripeLabelDecorator-method-remove">Online Documentation</a>
   */
  @JsName("remove")
  final operator fun minusAssign(
    link: IContextLookupChainLink<ILabel>,
  )
  
  companion object : ClassMetadata<StripeLabelDecorator> {
  }
}

inline operator fun  StripeLabelDecorator.invoke(
    block: StripeLabelDecorator.() -> Unit
): StripeLabelDecorator = apply(block)
