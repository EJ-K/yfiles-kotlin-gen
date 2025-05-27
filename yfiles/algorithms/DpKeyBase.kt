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
import yfiles.lang.YObject

/**
 * This is the base class of all look-up keys that are used to register [IDataProvider] with a [Graph].
 * @param [TValue] The type of the values that are returned by the [IDataProvider] registered with this class.
 * @see [Graph.addDataProvider]
 * @see [Graph.getDataProvider]
 * @see [Graph.removeDataProvider]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DpKeyBase">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [DpKeyBase] class.
 * @param [valueType] The type of the values that are returned by the [IDataProvider] registered with this class.
 * @param [declaringType] Type that declares this key. If this key is used with the [LayoutExecutorAsync][yfiles.layout.LayoutExecutorAsync], then it must be set to `null`.
 * @param [name] The name of this key.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DpKeyBase%23DpKeyBase-constructor-DpKeyBase">Online Documentation</a>
 * 
 * @property valueType
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DpKeyBase%23valueType">Online Documentation</a>
 * 
 * @property declaringType
 * Gets the type that declares this key.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DpKeyBase%23declaringType">Online Documentation</a>
 * 
 * @property name
 * Gets the name of this key.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DpKeyBase%23name">Online Documentation</a>
 */
external open class DpKeyBase<TKey : YObject, TValue : Any>  (
final val valueType: YClass<TValue>,
final val declaringType: YClass<*>,
final val name: String) : YObject {

/**
 * Returns whether this key is equal to the specified `other`.
 * @param [other] The other key to compare with this instance.
 * @return `true` if the specified key is equal to this instance; otherwise, `false`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DpKeyBase%23DpKeyBase-method-equalsCore">Online Documentation</a>
 */
 final protected   fun equalsCore( other: DpKeyBase<TKey, TValue> ):Boolean

companion object : ClassMetadata<DpKeyBase<*, *>> {
}
}
