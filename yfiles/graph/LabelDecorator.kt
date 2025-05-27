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
import yfiles.input.IHandleProvider
import yfiles.input.ILabelSnapResultProvider
import yfiles.input.ILassoTestable
import yfiles.input.IMarqueeTestable
import yfiles.input.IPositionHandler
import yfiles.input.ISnapReferenceProvider
import yfiles.lang.ClassMetadata
import yfiles.lang.Func4
import yfiles.lang.IClassMetadata
import yfiles.view.IFocusRenderer
import yfiles.view.IHighlightRenderer
import yfiles.view.IObstacleProvider
import yfiles.view.ISelectionRenderer

/**
 * Helps in [decorating][ILookupDecorator] the [lookup][yfiles.collections.ILookup] method of [ILabel] instances by providing access to decorators for the most common types.
 * @see [GraphDecorator]
 * @see [LookupDecorator]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelDecorator">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [LabelDecorator] class.
 * @param [decorator] The decorator to use.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelDecorator%23LabelDecorator-constructor-LabelDecorator">Online Documentation</a>
 */
external class LabelDecorator (
  decorator: ILookupDecorator  = definedExternally,
)  {
  /**
   * Gets a [LookupDecorator] that decorates the [IClipboardHelper] type for [ILabel]s this instance has been created for.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelDecorator%23clipboardHelper">Online Documentation</a>
   */
  final val clipboardHelper: LookupDecorator<ILabel, IClipboardHelper<ILabel, *>>
  
  /**
   * Gets a [LookupDecorator] that decorates the [IEditLabelHelper] type for [ILabel]s this instance has been created for.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelDecorator%23editLabelHelper">Online Documentation</a>
   */
  final val editLabelHelper: LookupDecorator<ILabel, IEditLabelHelper>
  
  /**
   * Gets a [LookupDecorator] that decorates the [IFocusRenderer] type for [ILabel]s this instance has been created for.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelDecorator%23focusRenderer">Online Documentation</a>
   */
  final val focusRenderer: LookupDecorator<ILabel, IFocusRenderer<ILabel>>
  
  /**
   * Gets a [LookupDecorator] that decorates the [IHandleProvider] type for [ILabel]s this instance has been created for.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelDecorator%23handleProvider">Online Documentation</a>
   */
  final val handleProvider: LookupDecorator<ILabel, IHandleProvider>
  
  /**
   * Gets a [LookupDecorator] that decorates the [IHighlightRenderer] type for [ILabel]s this instance has been created for.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelDecorator%23highlightRenderer">Online Documentation</a>
   */
  final val highlightRenderer: LookupDecorator<ILabel, IHighlightRenderer<ILabel>>
  
  /**
   * Gets a [LookupDecorator] that decorates the [ILabelModelParameterFinder] type for [ILabel]s this instance has been created for.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelDecorator%23labelModelParameterFinder">Online Documentation</a>
   */
  final val labelModelParameterFinder: LookupDecorator<ILabel, ILabelModelParameterFinder>
  
  /**
   * Gets a [LookupDecorator] that decorates the [ILabelModelParameterProvider] type for [ILabel]s this instance has been created for.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelDecorator%23labelModelParameterProvider">Online Documentation</a>
   */
  final val labelModelParameterProvider: LookupDecorator<ILabel, ILabelModelParameterProvider>
  
  /**
   * Gets a [LookupDecorator] that decorates the [ILassoTestable] type for [ILabel]s this instance has been created for.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelDecorator%23lassoTestable">Online Documentation</a>
   */
  final val lassoTestable: LookupDecorator<ILabel, ILassoTestable>
  
  /**
   * Gets a [LookupDecorator] that decorates the [IMarqueeTestable] type for [ILabel]s this instance has been created for.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelDecorator%23marqueeTestable">Online Documentation</a>
   */
  final val marqueeTestable: LookupDecorator<ILabel, IMarqueeTestable>
  
  /**
   * Gets a [LookupDecorator] that decorates the [IMementoSupport] type for [ILabel]s this instance has been created for.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelDecorator%23mementoSupport">Online Documentation</a>
   */
  final val mementoSupport: LookupDecorator<ILabel, IMementoSupport<ILabel, *>>
  
  /**
   * Gets a [LookupDecorator] that decorates the [IObstacleProvider] type for [ILabel]s this instance has been created for.
   * @see [GraphObstacleProvider][yfiles.view.GraphObstacleProvider]
   * @see [BridgeManager][yfiles.view.BridgeManager]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelDecorator%23obstacleProvider">Online Documentation</a>
   */
  final val obstacleProvider: LookupDecorator<ILabel, IObstacleProvider>
  
  /**
   * Gets a [LookupDecorator] that decorates the [IPositionHandler] type for the [ILabel]s this instance has been created for.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelDecorator%23positionHandler">Online Documentation</a>
   */
  final val positionHandler: LookupDecorator<ILabel, IPositionHandler>
  
  /**
   * Gets a [LookupDecorator] that decorates the [ISelectionRenderer] type for [ILabel]s this instance has been created for.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelDecorator%23selectionRenderer">Online Documentation</a>
   */
  final val selectionRenderer: LookupDecorator<ILabel, ISelectionRenderer<ILabel>>
  
  /**
   * Gets a [LookupDecorator] that decorates the [ISnapReferenceProvider] type for [ILabel]s this instance has been created for.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelDecorator%23snapReferenceProvider">Online Documentation</a>
   */
  final val snapReferenceProvider: LookupDecorator<ILabel, ISnapReferenceProvider>
  
  /**
   * Gets a [LookupDecorator] that decorates the [ILabelSnapResultProvider] type for [ILabel]s this instance has been created for.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelDecorator%23snapResultProvider">Online Documentation</a>
   */
  final val snapResultProvider: LookupDecorator<ILabel, ILabelSnapResultProvider>
  
  /**
   * Adds an [IContextLookupChainLink].
   * @param [link] The lookup chain link to add.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelDecorator%23LabelDecorator-method-add">Online Documentation</a>
   */
  fun add(
    link: IContextLookupChainLink<ILabel>,
  )
  
  /**
   * Adds an [IContextLookupChainLink].
   * @param [link] The lookup chain link to add.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelDecorator%23LabelDecorator-method-add">Online Documentation</a>
   */
  @JsName("add")
  final operator fun plusAssign(
    link: IContextLookupChainLink<ILabel>,
  )
  
  /**
   * Adds a generic callback as a chain link to the lookup.
   * @param [genericLink] The generic callback to add to the lookup chain.
   * @return An [IContextLookupChainLink] that has been [added][ILookupDecorator] to the lookup.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelDecorator%23LabelDecorator-method-addGenericLookup">Online Documentation</a>
   */
  fun addGenericLookup(
    genericLink: Func4<ILabel, IClassMetadata<*>, IContextLookup<*>, Any>,
  ): IContextLookupChainLink<*>
  
  /**
   * Creates a [LookupDecorator] for [ILabel]s that can be used to decorate `TInterface` types of the labels.
   * @param [TInterface] The type of the interface that should be decorated of the instances' [lookup][yfiles.collections.ILookup].
   * @param [interfaceType] The type of the interface that should be decorated of the instances' [lookup][yfiles.collections.ILookup].
   * @return A new [LookupDecorator] for the specified interface.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelDecorator%23LabelDecorator-method-getDecoratorFor">Online Documentation</a>
   */
  fun <TInterface> getDecoratorFor(
    interfaceType: IClassMetadata<TInterface>,
  ): LookupDecorator<ILabel, TInterface>
  
  /**
   * Removes an [IContextLookupChainLink] that has been added by one of the various decorators for labels.
   * @param [link] The lookup chain link to remove.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelDecorator%23LabelDecorator-method-remove">Online Documentation</a>
   */
  fun remove(
    link: IContextLookupChainLink<ILabel>,
  )
  
  /**
   * Removes an [IContextLookupChainLink] that has been added by one of the various decorators for labels.
   * @param [link] The lookup chain link to remove.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelDecorator%23LabelDecorator-method-remove">Online Documentation</a>
   */
  @JsName("remove")
  final operator fun minusAssign(
    link: IContextLookupChainLink<ILabel>,
  )
  
  companion object : ClassMetadata<LabelDecorator> {
  }
}

inline operator fun  LabelDecorator.invoke(
    block: LabelDecorator.() -> Unit
): LabelDecorator = apply(block)
