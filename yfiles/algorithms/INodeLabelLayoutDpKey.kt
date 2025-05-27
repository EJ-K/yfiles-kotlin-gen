// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.algorithms

import yfiles.lang.ClassMetadata
import yfiles.lang.YClass

/**
 * This class is used as look-up key for registering [IDataProvider] for [INodeLabelLayout][yfiles.layout.INodeLabelLayout]s with a [Graph].
 * @param [TValue] The type of the values that are returned by the [IDataProvider] registered with this class.
 * @see [Graph.addDataProvider]
 * @see [Graph.getDataProvider]
 * @see [Graph.removeDataProvider]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/INodeLabelLayoutDpKey">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [INodeLabelLayoutDpKey] class.
 * @param [valueType] The type of the values that are returned by the [IDataProvider] registered with this class.
 * @param [declaringType] Type that declares this key. If this key is used with the [LayoutExecutorAsync][yfiles.layout.LayoutExecutorAsync], then it must be set to `null`.
 * @param [name] The name of this key.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/INodeLabelLayoutDpKey%23INodeLabelLayoutDpKey-constructor-INodeLabelLayoutDpKey">Online Documentation</a>
 */
external open class INodeLabelLayoutDpKey<TValue : Any>  ( valueType: YClass<TValue> ,
 declaringType: YClass<*> ,
 name: String ) : ILabelLayoutDpKey<TValue> {

companion object : ClassMetadata<INodeLabelLayoutDpKey<*>> {
}
}
